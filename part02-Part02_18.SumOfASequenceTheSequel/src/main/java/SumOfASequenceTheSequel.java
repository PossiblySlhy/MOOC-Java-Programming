
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Second number?");
        int second = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
