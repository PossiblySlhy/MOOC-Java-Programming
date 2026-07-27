
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer.toString());
            timer.advance();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
