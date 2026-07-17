
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create loop to allow user to enter multiple strings
        while (true) {
            String text = scanner.nextLine();

            // Escape loop if user enters an empty string
            if (text.equals("")) {
                break;
            }

            // Split the input using whitespace, then check
            // if any words contain av
            String[] pieces = text.split("\\s+");
            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
