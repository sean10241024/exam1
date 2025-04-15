import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameContext context = GameInitializer.initialize();
        Scanner scanner = new Scanner(System.in);
        CommandParser parser = new CommandParser();

        System.out.println("👾 [ 遊戲開始！歡迎勇者 " + context.getPlayer().getName() + "！ ]");
        while (!context.isGameOver()) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            Command command = parser.parse(input);
            if (command != null) {
                command.execute(context);
            } else {
                System.out.println("無效的指令！");
            }
        }
        scanner.close();
        System.out.println("👋 感謝遊玩！再會，勇者！");
    }
}