public class SelectionSort {

    public static int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int position = i;
            int min = array[i];

            for(int j = i + 1; j < array.length; j++ ) {
                if(array[j] < min) {
                    position = j;
                    min = array[j];
                }
            }

            array[position] = array[i];
            array[i] = min;

            System.out.println("Cycle in " + (i + 1) + " step");

            for(int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
        return array;
    }
}
