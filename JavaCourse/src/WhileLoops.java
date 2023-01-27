import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;
        do {
            System.out.print("Type a number...: ");
            x = sc.nextInt();
            count++;
        } while (x != 10);

        System.out.printf("It took you %s attempts to find the number 10%n", count);
    }
}
