import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        List<List<Integer>> matrix = convertToMatrix(sc, size);

        int diagonalDifference = calcDiff(matrix, size);
        System.out.println(diagonalDifference);
    }

    private static List<List<Integer>> convertToMatrix(Scanner sc, int size) {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String[] currentRow = sc.nextLine().split(" ");
            List<Integer> currentList = new ArrayList<Integer>();

            for (String num: currentRow) {
                currentList.add(Integer.parseInt(num));
            }

            matrix.add(currentList);
        }

        return matrix;
    }

    private static int calcDiff(List<List<Integer>> matrix, int size) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int j = size - 1;

        for (int i = 0; i < size; i++) {
            leftDiagonalSum += matrix.get(i).get(i);
            rightDiagonalSum += matrix.get(j).get(i);
            j--;
        }

        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }
}
