
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdService service = new BirdService();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String engName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latName = scan.nextLine();

                service.add(engName, latName);

                System.out.println("");
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String observation = scan.nextLine();

                service.observe(observation);

                System.out.println("");
            } else if (command.equals("All")) {
                System.out.println("");
                service.printAll();
                System.out.println("");
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();

                service.printOne(bird);

                System.out.println("");
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Not a recognized command!\n");
            }
        }
    }

}
