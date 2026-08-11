
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nFirst name: ");
            String firstName = scanner.nextLine();

            // Have to check if first name is blank before continuing
            // with inputting other data
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("\nLast name: ");
            String lastName = scanner.nextLine();
            System.out.print("\nIdentification number: ");
            String idNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        // Printing empty line for better readability after inputting data above
        System.out.println();
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
