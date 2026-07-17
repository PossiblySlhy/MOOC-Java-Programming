
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Get user input and add to list
        // if input = -1, escape loop
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            numbers.add(input);
        }

        // Iterate through list and calculate the sum of numbers
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        // Calculate average of numbers of list and print
        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);
    }
}
