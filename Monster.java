public class Monster {
    private String name;
    private int hp;
    private int attack;

    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int dmg) {
        this.hp -= dmg;
    }

    public int getAttack() {
        return attack;
    }
}