import java.util.ArrayList;

public class GradeStats {
    public Grades gradebook;

    public GradeStats(Grades gradebook) {
        this.gradebook = gradebook;
    }

    public double gradeAverage() {
        return (double) this.gradebook.sum() / this.gradebook.count();
    }

    public double passingAverage() {
        ArrayList<Integer> passing = this.gradebook.passingGrades();

        if (passing.isEmpty()) {
            return -1;
        } else {
            int sum = 0;

            for (int grade : passing) {
                sum += grade;
            }

            return (double) sum / passing.size();
        }
    }

    public double passingPercentage() {
        return 100 * ((double) this.gradebook.passingCount() / this.gradebook.count());
    }

    public int gradeForPoints(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }

    public String gradeDistribution(int grade) {
        int count = 0;

        for (int score : this.gradebook.get()) {
            if (gradeForPoints(score) == grade) {
                count++;
            }
        }

        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stars.append("*");
        }

        return stars.toString();
    }
}
