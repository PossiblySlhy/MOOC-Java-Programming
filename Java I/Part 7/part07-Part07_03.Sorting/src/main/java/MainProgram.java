import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 2));

        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int start) {
        int smallest = array[start];
        int smallestIndex = start;

        for (int i = start; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
