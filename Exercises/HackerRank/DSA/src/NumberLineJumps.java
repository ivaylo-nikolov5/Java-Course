import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> coordinates = convertStrToList(sc.nextLine().split(" "));
        int x1 = coordinates.get(0);
        int y1 = coordinates.get(1);
        int x2 = coordinates.get(2);
        int y2 = coordinates.get(3);
        String result = kangaroo(x1, y1, x2, y2);
        System.out.println(result);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static String kangaroo(int x1, int y1, int x2, int y2) {
        if (x2 > x1 && y2 > y1){
            return "NO";
        }

        int firstKangaroo = x1;
        int secondKangaroo = x2;


        for (int i = 0; i < 10000; i++) {
            firstKangaroo += y1;
            secondKangaroo += y2;

            if (firstKangaroo == secondKangaroo) {
                return "YES";
            }
        }


        return "NO";
    }
}
