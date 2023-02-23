import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SalesByMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int socks = Integer.parseInt(sc.nextLine());
        List<Integer> colors = convertStrToList(sc.nextLine().split(" "));
        int pairs = sockMerchant(socks, colors);
        System.out.println(pairs);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> socks = new HashMap<>();
        int pairs = 0;

        for (int sock: ar) {
            if (!socks.containsKey(sock)) {
                socks.put(sock, 1);
                continue;
            }

            socks.put(sock, socks.get(sock) + 1);

            if (socks.get(sock) == 2) {
                socks.put(sock, 0);
                pairs++;
            }
        }

        return pairs;

    }
}
