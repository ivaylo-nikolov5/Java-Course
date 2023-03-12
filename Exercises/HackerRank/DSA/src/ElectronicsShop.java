import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> bnm = convertStrToList(sc.nextLine().split(" "));
        List<Integer> n = convertStrToList(sc.nextLine().split(" "));
        List<Integer> m = convertStrToList(sc.nextLine().split(" "));

        int budget = bnm.get(0);
        int keyboardModels = bnm.get(1);
        int usbModels = bnm.get(2);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el : stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }
}
