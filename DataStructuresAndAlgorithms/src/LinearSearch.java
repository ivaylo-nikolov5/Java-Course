public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 2, 3, 5, 6, 8, 6, 4, 2, 1, 7, 6, 2};
        int index = linearSearch(array, 1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element was not found!");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }


}
