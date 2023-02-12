import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int s = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);

        line = sc.nextLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        line = sc.nextLine().split(" ");
        int m = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);

        List<Integer> apples = convertStrToList(sc.nextLine().split(" "));
        List<Integer> oranges = convertStrToList(sc.nextLine().split(" "));

        int[] result = countApplesAndOranges(s, t, a, b, apples, oranges);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static int[] countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int[] fruitsInRange = {0, 0};

        for (int apple: apples) {
            if (apple + a >= s && apple + a <= t) {
                fruitsInRange[0]++;
            }
        }

        for (int orange: oranges) {
            if (orange + b >= s && orange + b <= t) {
                fruitsInRange[1]++;
            }
        }

        return fruitsInRange;
    }
}
