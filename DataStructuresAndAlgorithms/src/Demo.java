public class Demo {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 4, 3, 8, 6, 9, 7};
        mergeSort(array);
        for (int el: array) {
            System.out.println(el + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int middle = array.length / 2;
        int[] leftHalf = slice(array, middle, 0);
        int[] rightHalf = slice(array, length - middle, middle);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(leftHalf, rightHalf, array);
    }

    private static int[] slice(int[] array, int length, int idx) {
        int[] tempArray = new int[length];
        int i = 0;

        while (i < tempArray.length) {
            tempArray[i] = array[idx];
            idx++;
            i++;
        }

        return tempArray;
    }

    private static void merge(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftHalf[l] < rightHalf[r]) {
                array[i] = leftHalf[l];
                l++;
            } else {
                array[i] = rightHalf[r];
                r++;
            }

            i++;
        }

        while (l < leftSize) {
            array[i] = leftHalf[l];
            l++;
            i++;
        }

        while (r < rightSize) {
            array[i] = rightHalf[r];
            r++;
            i++;
        }

    }
}
