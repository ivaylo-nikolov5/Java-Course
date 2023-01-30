import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rent = sc.nextDouble();

        double cakePrice = rent * 0.2;
        double drinksPrice = cakePrice - cakePrice * 0.45;
        double animatorPrice = rent / 3;

        double neededBudget = rent + cakePrice + drinksPrice + animatorPrice;
        System.out.println(neededBudget);
    }
}
