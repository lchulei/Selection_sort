public class SelectionSort {

    public static int[] sort(int[] mas) {
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

            for(int k = 0; k < mas.length; k++) {
                System.out.print(mas[k] + " ");
            }
            System.out.println();
        }
        return mas;
    }
}
