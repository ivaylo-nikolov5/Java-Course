public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};
        int index = interpolationSearch(array, 1024);
        System.out.println(index);

    }

    private static int interpolationSearch(int[] array, int target) {
        int high = array.length - 1;
        int low = 0;

        while (target >= array[low] && target <= array[high] && low <= high) {
            int probe = low + (high - low) * (target - array[low]) /
                    (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == target) {
                return probe;
            } else if (array[probe] < target) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}

