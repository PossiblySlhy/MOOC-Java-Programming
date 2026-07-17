
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numbers = new ArrayList<>();

        // Get user input and escape loop when 9999 is entered
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 9999) {
                break;
            }

            numbers.add(input);
        }

        // Iterate through list to find smallest value
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);

            if (number < smallest) {
                smallest = number;
            }
        }

        // Print smallest value, then iterate through list to find occurrences
        // and print the index
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
