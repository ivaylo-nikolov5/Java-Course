import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> candles = convertStrToList(sc.nextLine().split(" "));
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        HashMap<Integer, Integer> numberRepetitions = new HashMap<>();

        for (int candle : candles) {
            max = Math.max(max, candle);

            if (numberRepetitions.containsKey(candle)) {
                numberRepetitions.put(candle, numberRepetitions.get(candle) + 1);
                continue;
            }

            numberRepetitions.put(candle, 1);
        }

        return numberRepetitions.get(max);
    }
}
