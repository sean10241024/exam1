import java.util.*;

public class Player {
    private String name;
    private int hp;
    private int attack;
    private int totalDamage = 0;
    private int killCount = 0;
    private Map<String, Skill> skills = new HashMap<>();

    public Player(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void addSkill(Skill skill) {
        skills.put(skill.getName().toLowerCase(), skill);
    }

    public boolean hasSkill(String name) {
        return skills.containsKey(name.toLowerCase());
    }

    public Skill getSkill(String name) {
        return skills.get(name.toLowerCase());
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public void heal(int amount) {
        this.hp += amount;
        System.out.println("你喝下治療藥水，回復 " + amount + " HP！");
        System.out.println("你的 HP：" + hp);
    }

    public void takeDamage(int dmg) {
        this.hp -= dmg;
    }

    public void addDamage(int dmg) {
        totalDamage += dmg;
    }

    public void incrementKill() {
        killCount++;
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public int getKillCount() {
        return killCount;
    }

    public String getName() {
        return name;
    }

    public void printStatus() {
        System.out.println("=== 狀態更新 ===");
        System.out.println("你的 HP：" + hp);
        System.out.println("總傷害：" + totalDamage + "，擊殺數：" + killCount);
    }
}