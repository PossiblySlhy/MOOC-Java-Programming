
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create loop to allow user to enter multiple strings
        while (true) {
            String text = scanner.nextLine();

            // Escape loop if user enters an empty string
            if (text.equals("")) {
                break;
            }

            // Split the input using whitespace, then print each
            // word in the string array
            String[] pieces = text.split(" ");
            for (String word : pieces) {
                System.out.println(word);
            }
        }
    }
}
