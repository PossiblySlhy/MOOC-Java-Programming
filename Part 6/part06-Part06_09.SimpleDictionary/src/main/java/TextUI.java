import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            System.out.println("");

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("\nTranslation: ");
                String translation = scanner.nextLine();
                System.out.println("");

                this.dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String searchWord = scanner.nextLine();
                System.out.println("");

                if (dictionary.translate(searchWord) == null) {
                    System.out.println("Word " + searchWord + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(searchWord));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
