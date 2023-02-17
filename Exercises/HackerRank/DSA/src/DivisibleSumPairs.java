import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nk = convertStrToList(sc.nextLine().split(" "));
        List<Integer> vals = convertStrToList(sc.nextLine().split(" "));
        int k = nk.get(1);

        int result = divisibleSumPairs(k, vals);
        System.out.println(result);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static int divisibleSumPairs(int k, List<Integer> ar) {
        int pairs = 0;

        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
