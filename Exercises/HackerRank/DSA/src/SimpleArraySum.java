import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int[] array = convertStrToArr(sc.nextLine().split(" "));

        int sum = sumArrayNumbers(array);
        System.out.println(sum);
    }

    private static int[] convertStrToArr(String[] stringArray) {
        int length = stringArray.length;
        int[] intArray = new int[length];

        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    private static int sumArrayNumbers(int[] array) {
        int sum = 0;

        for (int num: array) {
            sum += num;
        }

        return sum;
    }
}
