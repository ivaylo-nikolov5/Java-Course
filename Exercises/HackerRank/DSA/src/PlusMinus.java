import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = convertStrToList(sc.nextLine().split(" "));

        plusMinus(numbers);
    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }

    private static void plusMinus(List<Integer> arr) {
        double size = arr.size();
        int positivesCount = 0;
        int negativesCount = 0;
        int zerosCount = 0;

        for (int num: arr) {
            if (num > 0) {
                positivesCount++;
            } else if (num < 0) {
                negativesCount++;
            } else {
                zerosCount++;
            }
        }

        calculateProportion(size, positivesCount, negativesCount, zerosCount);
    }

    private static void calculateProportion(double size, int positivesCount,
                                            int negativesCount, int zerosCount) {
        double positivesProportion = positivesCount / size;
        double negativesProportion = negativesCount / size;
        double zerosProportion = zerosCount / size;

        System.out.println(String.format("%.6f", positivesProportion) + "\n" +
                           String.format("%.6f", negativesProportion) + "\n" +
                           String.format("%.6f", zerosProportion) + "\n");
    }
}
