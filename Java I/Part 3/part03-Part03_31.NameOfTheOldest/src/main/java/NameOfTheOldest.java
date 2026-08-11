
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String[] pieces = nameAndAge.split(",");
            String name = pieces[0];
            int age = Integer.parseInt(pieces[1]);
            if (age > oldest) {
                oldest = age;
                oldestName = name;
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
    }
}
