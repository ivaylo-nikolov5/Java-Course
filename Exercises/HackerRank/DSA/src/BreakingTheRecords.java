import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> scores = convertStrToList(sc.nextLine().split(" "));

        List<Integer> result = breakingRecords(scores);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static List<Integer> breakingRecords(List<Integer> scores) {
        int highestScore = scores.get(0), lowestScore = scores.get(0);
        List<Integer> result = new ArrayList<>(Arrays.asList(0, 0));

        for (int score: scores) {
            if (score > highestScore) {
                highestScore = score;
                result.set(0, result.get(0) + 1);
            }
            if (score < lowestScore) {
                lowestScore = score;
                result.set(1, result.get(1) + 1);
            }
        }

        return result;
    }
}
