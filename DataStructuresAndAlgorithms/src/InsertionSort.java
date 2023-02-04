public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 6, 2, 9, 8, 5, 3};
        insertionSort(array);
        for (int element: array) {
            System.out.print(element + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] > array[j]) {
                    break;
                }

                array[j + 1] = array[j];
                array[j] = temp;
            }


        }

    }
}
