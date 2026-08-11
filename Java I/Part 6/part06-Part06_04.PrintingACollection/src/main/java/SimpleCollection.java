
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return String.format("The collection %s is empty.", this.name);
        } else if (elements.size() == 1) {
            String printOutput = String.format("The collection %s has %d element:", this.name,
                    this.elements.size()) + "\n";

            return printOutput + elements.get(0);
        } else {
            String list = "";
            String printOutput = String.format("The collection %s has %d elements:", this.name,
                    this.elements.size()) + "\n";

            for (String element : elements) {
                list = list + element + "\n";
            }

            return printOutput + list;
        }
    }
}
