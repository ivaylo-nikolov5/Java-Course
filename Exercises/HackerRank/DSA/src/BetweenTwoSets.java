import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> sizes = convertStrToList(sc.nextLine().split(" "));
        List<Integer> a = convertStrToList(sc.nextLine().split(" "));
        List<Integer> b = convertStrToList(sc.nextLine().split(" "));

        int result = getTotalX(a, b);
        System.out.println(result);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static int getTotalX(List<Integer> a, List<Integer> b) {
        int res = 0;
        List<Integer> nums = new ArrayList<>();
        int x = b.get(b.size() - 1);

        for (int i = a.get(0); i <= x; i++) {
            if (x % i == 0) {
                nums.add(i);
            }
        }

        for (int n: nums) {
            boolean valid = true;

            for (int i: a) {
                if (n % i != 0) {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                continue;
            }

            for (int i: b) {
                if (i % n != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                res++;
            }
        }


        return res;
    }
}
