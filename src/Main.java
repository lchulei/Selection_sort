import java.util.Scanner;

public class Main {

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {6, 7, 2, 8, 3, 5};

        System.out.println("Input array: ");
        printArray(array);

        SelectionSort.sort(array);

        System.out.println("Output array: ");
        printArray(array);
    }
}
