import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squaresNumber = Integer.parseInt(sc.nextLine());
        List<Integer> squares = convertStrToList(sc.nextLine().split(" "));
        List<Integer> birthdayInfo = convertStrToList(sc.nextLine().split(" "));
        int day = birthdayInfo.get(0);
        int month = birthdayInfo.get(1);

        int result = birthday(squares, day, month);
        System.out.println(result);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static int birthday(List<Integer> s, int d, int m) {
        int ways = 0;
        int currentSum = 0;

        for (int i = 0; i < m; i++) {
            currentSum += s.get(i);
        }

        if (currentSum == d) {
            ways++;
        }

        for (int i = m; i < s.size(); i++) {
            currentSum += s.get(i) - s.get(i - m);

            if (currentSum == d) {
                ways++;
            }
        }

//        for (int i = 0; i < s.size() - m + 1; i++) {
//            int currentSum = 0;
//            for (int j = i; j < m + i; j++) {
//                currentSum += s.get(j);
//                if (currentSum > d) {
//                    break;
//                }
//            }
//
//            if (currentSum == d) {
//                ways++;
//            }
//        }

        return ways;
    }
}
