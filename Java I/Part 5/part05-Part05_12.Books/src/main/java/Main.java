
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            boolean bookExists = false;

            // Check if this is the first book being added, if it is proceed without
            // checking
            // otherwise no book would be added to the ArrayList
            if (books.size() == 0) {
                books.add(book);
                System.out.println("Added book: " + book.getName() + " " + book.getPublicationYear());
                continue;
            }

            for (Book entry : books) {
                if (entry.equals(book)) {
                    bookExists = true;
                    System.out.println("Book already exists, skipping entry...");
                    break;
                }
            }

            if (!bookExists) {
                books.add(book);
                System.out.println("Added book: " + book.getName() + " " + book.getPublicationYear());
            }
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
