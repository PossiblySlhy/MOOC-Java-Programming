import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] intArray = { 3, 1, 5, 99, 3, 12 };
        String[] stringArray = { "b", "d", "z", "a", "r" };
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        for (int num : intArray) {
            intList.add(num);
        }

        for (String word : stringArray) {
            stringList.add(word);
        }

        sort(intArray);
        sort(stringArray);
        sortIntegers(intList);
        sortStrings(stringList);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(intList);
        System.out.println(stringList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> ints) {
        ints.sort(null);
    }

    public static void sortStrings(ArrayList<String> strings) {
        strings.sort(null);
    }
}
