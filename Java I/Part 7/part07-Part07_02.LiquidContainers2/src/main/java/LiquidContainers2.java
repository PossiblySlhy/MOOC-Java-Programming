
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        System.out.println("First: " + container1.toString());
        System.out.println("Second: " + container2.toString());
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.parseInt(parts[1]);

            if (input.startsWith("add")) {
                container1.add(amount);
            } else if (input.startsWith("remove")) {
                container2.remove(amount);
            } else if (input.startsWith("move")) {
                if (amount >= container1.contains()) {
                    // If the amount moved from container1 exceeds or equals
                    // the amount currently in container1, check if that amount
                    // would exceed 100L in container 2
                    if ((container2.contains() + container1.contains()) > 100) {
                        // Amount exceeds current container1 contents and exceeds
                        // 100L for container2
                        // e.g. container1 = 60, container2 = 50, amount = 70
                        container2.add(amount);
                        container1.remove(amount);
                    } else {
                        // Adding amount in container1 to container2 does not exceed 100L
                        // e.g. container1 = 20, container2 = 50, amount = 50
                        container2.add(container1.contains());
                        container1.remove(amount);
                    }
                } else {
                    container2.add(amount);
                    container1.remove(amount);
                }
            }

            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
        }
    }
}
