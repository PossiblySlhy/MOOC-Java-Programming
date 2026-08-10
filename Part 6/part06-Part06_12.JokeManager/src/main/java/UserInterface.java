import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(
                    "1 - add a joke\n" +
                            "2 - draw a joke\n" +
                            "3 - list jokes\n" +
                            "X - stop");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String toAdd = scanner.nextLine();

                manager.addJoke(toAdd);
            } else if (command.equals("2")) {
                System.out.println(manager.drawJoke());
            } else if (command.equals("3")) {
                manager.printJokes();
            }
        }
    }
}
