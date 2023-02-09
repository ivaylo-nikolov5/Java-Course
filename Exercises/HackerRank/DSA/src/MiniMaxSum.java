import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> array = convertStrToList(sc.nextLine().split(" "));

        List<Long> result = findMinMaxSum(array);
        System.out.println(result.get(0) + " " + result.get(1));
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static List<Long> findMinMaxSum(List<Integer> arr) {
        List<Long> minMaxSum= new ArrayList<>(Arrays.asList(Long.MAX_VALUE, Long.MIN_VALUE));
        long sum = sumArray(arr);

        for (int num: arr) {
            long tempSum = sum - num;

            if (tempSum < minMaxSum.get(0)) {
                minMaxSum.set(0, tempSum);
            }

            if (tempSum > minMaxSum.get(1)) {
                minMaxSum.set(1, tempSum);
            }
        }

        return minMaxSum;

    }

    private static long sumArray(List<Integer> arr) {
        long sum = 0;

        for (int num: arr) {
            sum += num;
        }

        return sum;
    }

}
