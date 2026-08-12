import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> gradebook;

    public Grades() {
        this.gradebook = new ArrayList<>();
    }

    public ArrayList<Integer> get() {
        return this.gradebook;
    }

    public void addGrade(int score) {
        if (score <= 100 && score >= 0) {
            this.gradebook.add(score);
        }
    }

    public int sum() {
        int sum = 0;

        for (int grade : this.gradebook) {
            sum += grade;
        }

        return sum;
    }

    public int count() {
        return this.gradebook.size();
    }

    public ArrayList<Integer> passingGrades() {
        ArrayList<Integer> passingGrades = new ArrayList<>();

        for (int grade : this.gradebook) {
            if (grade >= 50) {
                passingGrades.add(grade);
            }
        }

        return passingGrades;
    }

    public int passingCount() {
        return this.passingGrades().size();
    }
}
