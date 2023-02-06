public class Demo {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 6, 3, 8, 7, 9, 5};
        quickSort(array, 0, array.length - 1);

        for (int el: array) {
            System.out.print(el + " ");
        }
    }

    private static int binarySearch(int[] array, int number) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midEl = array[mid];

            if (midEl == number) {
                return mid;
            } else if (midEl < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    continue;
                }

                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
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

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;
        int middle = array.length / 2;

        int[] leftHalf = split(array, 0, middle, middle);
        int[] rightHalf = split(array, middle, length, length - middle);

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array ,leftHalf, rightHalf);

    }

    private static int[] split(int[] array, int start, int end, int length) {
        int[] tempArray = new int[length];
        int j = 0;
        for (int i = start; i < end; i++) {
            tempArray[j] = array[i];
            j++;
        }

        return tempArray;
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
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

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[end] = temp;

        return i;
    }
}
