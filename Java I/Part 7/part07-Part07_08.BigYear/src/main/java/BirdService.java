import java.util.ArrayList;

public class BirdService {
    private ArrayList<Bird> birds;

    public BirdService() {
        this.birds = new ArrayList<>();
    }

    public void add(String engName, String latName) {
        this.birds.add(new Bird(engName, latName));
    }

    public void observe(String observation) {
        for (Bird bird : birds) {
            if (bird.getEngName().equals(observation)) {
                bird.observed();
                return;
            }
        }

        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }

    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getEngName().equals(name)) {
                System.out.println("\n" + bird.toString());
                return;
            }
        }

        System.out.println("Bird not found!");
    }
}
