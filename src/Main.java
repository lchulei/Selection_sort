import java.util.Scanner;

public class Main {

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        int[] mas = {6, 7, 2, 8, 3, 5};

        System.out.println("Вхідний масив: ");
        printArray(mas);

        SelectionSort.sort(mas);

        System.out.println("Кінцевий масив: ");
        printArray(mas);
    }
}
