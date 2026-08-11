
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        // strings.add("a");
        // strings.add("b");
        // strings.add("c");

        removeLast(strings);
        // System.out.println(strings);
        // removeLast(strings);
        // System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        } else {
            strings.remove(strings.size() - 1);
        }
    }
}
