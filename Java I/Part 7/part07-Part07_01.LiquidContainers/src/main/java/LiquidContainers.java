
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                // <---------- ADD COMMAND ---------->
                String[] parts = input.split(" ");
                int amount = Integer.parseInt(parts[1]);

                if ((container1 + amount) > 100) {
                    container1 = 100;
                } else if (amount > 0) {
                    container1 += amount;
                }

                System.out.println(""); // Print empty line for readability
            } else if (input.startsWith("move")) {
                // <---------- MOVE COMMAND ---------->
                String[] parts = input.split(" ");
                int amount = Integer.parseInt(parts[1]);

                if (amount >= container1) {
                    // If the amount moved from container1 exceeds or equals
                    // the amount currently in container1, check if that amount
                    // would exceed 100L in container 2
                    if ((container2 + container1) > 100) {
                        // Amount exceeds current container1 contents and exceeds
                        // 100L for container2
                        // e.g. container1 = 60, container2 = 50, amount = 70
                        container2 = 100;
                        container1 = 0;
                    } else {
                        // Adding amount in container1 to container2 does not exceed 100L
                        // e.g. container1 = 20, container2 = 50, amount = 50
                        container2 += container1;
                        container1 = 0;
                    }
                } else if (amount > 0) {
                    if ((amount + container2) > 100) {
                        container2 = 100;
                        container1 -= amount;
                    } else {
                        container2 += amount;
                        container1 -= amount;
                    }
                }

                System.out.println(""); // Print empty line for readability
            } else if (input.startsWith("remove")) {
                // <---------- REMOVE COMMAND ---------->
                String[] parts = input.split(" ");
                int amount = Integer.parseInt(parts[1]);

                if (amount >= container2) {
                    container2 = 0;
                } else if (amount > 0) {
                    container2 -= amount;
                }

                System.out.println(""); // Print empty line for readability
            }

        }

        // System.out.println("First: " + container1 + "/100");
        // System.out.println("Second: " + container2 + "/100");
    }

}
