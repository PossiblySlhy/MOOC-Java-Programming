
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        // Get input and establish variables for the search
        System.out.println("Search for?");
        String searchFor = scanner.nextLine();
        boolean found = false;

        // Iterate through list to confirm if the name is in the list
        for (String name : list) {
            if (name.equals(searchFor)) {
                found = true;
            }
        }

        if (found) {
            System.out.println(searchFor + " was found!");
        } else {
            System.out.println(searchFor + " was not found!");
        }
    }
}
