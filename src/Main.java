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

        for(int i = 0; i < mas.length; i++) {
            int p = i;
            int min = mas[i];

            for(int j = i + 1; j < mas.length; j++ ) {
                if(mas[j] < min) {
                    p = j;
                    min = mas[j];
                }
            }

            mas[p] = mas[i];
            mas[i] = min;

            System.out.println("Цикл на " + (i + 1) + " кроці");
            printArray(mas);
        }
        System.out.println("Кінцевий масив: ");
        printArray(mas);
    }
}
