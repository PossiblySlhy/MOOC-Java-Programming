
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0.0;
        double sum = 0.0;

        while (true) {
            System.out.println("Give a number: ");
            double number = Double.valueOf(scanner.nextLine());
            if (number != 0) {
                count++;
                sum += number;
            } else {
                break;
            }
        }

        double avg = (sum / count);
        System.out.println("Average of the numbers: " + avg);
    }
}
