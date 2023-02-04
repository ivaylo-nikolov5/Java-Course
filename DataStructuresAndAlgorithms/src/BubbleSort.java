public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 7, 4, 2, 8, 6};
        bubbleSort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                // switch to >= for descending order
                if (array[j] < array[j + 1]) {
                    continue;
                }

                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
    }
}
