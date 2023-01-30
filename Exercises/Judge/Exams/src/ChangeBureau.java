import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bitcoins = sc.nextInt();
        double yuans = sc.nextDouble();
        double commission = sc.nextDouble();

        int bitcoinsPrice = bitcoins * 1168;
        double yuansPrice = yuans * 0.15;
        yuansPrice *= 1.76;

        double total = bitcoinsPrice + yuansPrice;
        total /= 1.95;
        double commissionPrice = total * commission / 100;
        total -= commissionPrice;

        System.out.println(String.format("%.2f", total));
    }
}
