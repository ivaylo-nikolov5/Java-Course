import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nk = convertStrToList(sc.nextLine().split(" "));
        List<Integer> bill = convertStrToList(sc.nextLine().split(" "));
        int charge = Integer.parseInt(sc.nextLine());
        bonAppetit(bill, nk.get(1), charge);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static void bonAppetit(List<Integer> bill, int k, int b) {
        int billWithoutK = calcBillWithoutK(bill, k);

        String result = (billWithoutK / 2 == b) ? "Bon Appetit" : "" + (b - (billWithoutK / 2));
        System.out.println(result);
    }

    private static int calcBillWithoutK(List<Integer> bill, int k) {
        int sum = 0;

        for (int i: bill) {
            sum += i;
        }

        return sum - bill.get(k);
    }
}
