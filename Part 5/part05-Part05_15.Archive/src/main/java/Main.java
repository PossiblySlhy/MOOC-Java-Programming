import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> collection = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.isEmpty()) {
                System.out.println("=============================");
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("=============================");
                break;
            }

            System.out.println("=============================");

            Archive item = new Archive(id, name);
            boolean itemExists = false;

            // If this is the first item being added, add it without checking for
            // existing items then continue for more input
            if (collection.size() == 0) {
                collection.add(item);
                continue;
            }

            for (Archive entry : collection) {
                if (entry.equals(item)) {
                    itemExists = true;
                    break;
                }
            }

            if (!itemExists) {
                collection.add(item);
            }
        }

        System.out.println("\n\n======== Items ========");
        for (Archive item : collection) {
            System.out.println(item.toString());
        }
    }
}
