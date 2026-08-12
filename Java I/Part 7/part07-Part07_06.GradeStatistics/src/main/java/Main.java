
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades gradebook = new Grades();
        GradeStats gradeStats = new GradeStats(gradebook);

        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            } else {
                gradebook.addGrade(input);
            }
        }

        System.out.println("Point average (all): " + gradeStats.gradeAverage());

        if (gradeStats.passingAverage() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gradeStats.passingAverage());
        }

        System.out.println("Pass percentage: " + gradeStats.passingPercentage());

        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.println(grade + ": " + gradeStats.gradeDistribution(grade));
        }
    }
}
