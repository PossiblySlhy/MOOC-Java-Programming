
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        double avg = 0.0;

        while (true) {
            System.out.println("Give a number: ");
            double number = Double.valueOf(scanner.nextLine());
            if (number > 0) {
                count++;
                sum += number;
            } else if (number < 0) {
                continue;
            } else {
                break;
            }
        }

        avg = (sum / count);
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        }
    }
}
