import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        boolean gameOver = false;

        // loop do jogo
        while (!gameOver) {
            // mensagem de boas-vindas e descrição da sala atual
            game.printWelcome();

            // pede ao usuário que digite um comando
            System.out.print("> ");
            Command command = game.getParser().getCommand(scanner.nextLine());

            // verifica o comando e executa a ação correspondente
            switch (command.getCommandWord()) {
                case "go":
                    game.goRoom(command);
                    break;
                case "help":
                    System.out.println("Você está perdido. Você está sozinho. Você vagueia");
                    System.out.println("pelo campus.");
                    System.out.println();
                    System.out.println("Seus comandos são:");
                    game.printValidCommands();
                    break;
                case "quit":
                    gameOver = true;
                    break;
                default:
                    System.out.println("Não sei o que você quer dizer...");
                    break;
            }
        }
    }
}

