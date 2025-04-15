public class GameContext {
    private Player player;
    private Room currentRoom;
    private boolean gameOver = false;

    public GameContext(Player player, Room startingRoom) {
        this.player = player;
        this.currentRoom = startingRoom;
    }

    public Player getPlayer() {
        return player;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean isGameOver() {
        return gameOver || player.getHp() <= 0;
    }
}