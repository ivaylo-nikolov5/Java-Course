public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 9, 1, 4, 3, 6, 4, 5};
        selectionSort(array);

        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                // switch to < for descending order
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
