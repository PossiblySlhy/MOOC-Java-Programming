
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longestLength = 0;
        String longestName = "";

        while (true) {
            String nameYear = scanner.nextLine();

            if (nameYear.equals("")) {
                break;
            }

            String[] pieces = nameYear.split(",");
            String name = pieces[0];
            int year = Integer.parseInt(pieces[1]);
            int nameLength = name.length();

            // Calculating sum to use in calculation of average later
            sum += year;
            if (nameLength > longestLength) {
                longestLength = nameLength;
                longestName = name;
            }

            count++;
        }

        double average = (double) sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
