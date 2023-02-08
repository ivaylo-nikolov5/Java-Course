import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        List<Long> numbers = convertStrToList(sc.nextLine().split(" "));

        long sum = sumElements(numbers);
        System.out.println(sum);
    }

    private static List<Long> convertStrToList(String[] stringArray) {
        List<Long> currentList = new ArrayList<Long>();

        for (String el: stringArray) {
            currentList.add(Long.parseLong(el));
        }

        return currentList;
    }

    private static long sumElements(List<Long> numbers) {
        long sum = 0;

        for (long num: numbers) {
            sum += num;
        }

        return sum;
    }
}
