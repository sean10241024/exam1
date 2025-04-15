import java.util.HashMap;
import java.util.Map;

public class Room {
    private String name;
    private String description;
    private Monster monster;
    private boolean hasPotion;
    private Map<String, Room> exits = new HashMap<>();

    public Room(String name, String description, Monster monster, boolean hasPotion) {
        this.name = name;
        this.description = description;
        this.monster = monster;
        this.hasPotion = hasPotion;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Monster getMonster() {
        return monster;
    }

    public void removeMonster() {
        this.monster = null;
    }

    public boolean hasPotion() {
        return hasPotion;
    }

    public void usePotion() {
        this.hasPotion = false;
    }

    public void setExit(String direction, Room room) {
        exits.put(direction.toLowerCase(), room);
    }

    public Room getExit(String direction) {
        return exits.get(direction.toLowerCase());
    }

    public String getAvailableExits() {
        return String.join(", ", exits.keySet());
    }
}