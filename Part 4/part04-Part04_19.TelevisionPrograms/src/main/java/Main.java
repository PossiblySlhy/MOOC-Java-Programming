import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nName: ");
            String name = scanner.nextLine();

            // Have to check if name is empty before collecting
            // additional data
            if (name.isEmpty()) {
                break;
            }

            System.out.print("\nDuration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println("\nProgram's maximum duration?");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
