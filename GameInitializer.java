public class GameInitializer {
    public static GameContext initialize() {
        Player player = new Player("勇者", 100, 15);
        player.addSkill(new FireballSkill());

        Monster goblin = new Monster("哥布林", 30, 8);
        Room forest = new Room("森林入口", "你站在茂密森林的邊緣", goblin, true);
        
        Monster skeleton = new Monster("骷髏戰士", 50, 12);
        Room temple = new Room("廢棄神殿", "破碎的石牆上布滿藤蔓，空氣中瀰漫著魔法的氣息", skeleton, false);
        
        forest.setExit("north", temple);
        temple.setExit("south", forest);

        return new GameContext(player, forest);
    }
}