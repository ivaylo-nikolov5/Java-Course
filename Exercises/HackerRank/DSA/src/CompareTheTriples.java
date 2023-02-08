import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> alicePoints = convertStrToList(sc.nextLine().split(" "));
        List<Integer> bobPoints = convertStrToList(sc.nextLine().split(" "));

        List<Integer> finalResult = calculateFinalPoints(alicePoints, bobPoints);
        System.out.println(finalResult.get(0) + " " + finalResult.get(1));
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static List<Integer> calculateFinalPoints(List<Integer> alicePoints, List<Integer> bobPoints) {
        List<Integer> finalResult = new ArrayList<Integer>(Arrays.asList(0, 0));

        int length = 3;
        for (int i = 0; i < length; i++) {
            if (alicePoints.get(i) > bobPoints.get(i)) {
                finalResult.set(0, finalResult.get(0) + 1);
            } else if (alicePoints.get(i) < bobPoints.get(i)){
                finalResult.set(1, finalResult.get(1) + 1);
            }
        }

        return finalResult;
    }
}
