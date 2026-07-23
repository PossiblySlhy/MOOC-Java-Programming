import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookCollection = new ArrayList<>();
        // implement here the program that allows the user to enter
        // book information and to examine them

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            // Check if input is empty before prompting for more data
            if (title.isEmpty()) {
                break;
            }

            System.out.print("\nPages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("\nPublication year:");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println(""); // Print empty line for readability

            bookCollection.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String request = scanner.nextLine();

        if (request.equals("everything")) {
            for (Book book : bookCollection) {
                System.out.println(book.printAll());
            }
        } else if (request.equals("name")) {
            for (Book book : bookCollection) {
                System.out.println(book.printTitle());
            }
        }
    }
}
