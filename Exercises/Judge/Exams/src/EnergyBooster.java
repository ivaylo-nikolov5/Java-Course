import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        String setSize = sc.next();
        int orderedSets = sc.nextInt();
        double price = 0;


        if (setSize.equals("small")) {
            switch (fruit) {
                case "Watermelon": price = 56 * 2; break;
                case "Mango": price = 36.66 * 2; break;
                case "Pineapple": price = 42.1 * 2; break;
                case "Raspberry": price = 20 * 2; break;
            }
        } else {
            switch (fruit) {
                case "Watermelon": price = 28.7 * 5; break;
                case "Mango": price = 19.6 * 5; break;
                case "Pineapple": price = 24.8 * 5; break;
                case "Raspberry": price = 15.2 * 5; break;
            }
        }

        price *= orderedSets;

        if (400 <= price && price <= 1000) {
            price -= price * 0.15;
        } else if (price > 1000) {
            price /= 2;
        }

        System.out.println(String.format("%.2f", price) + " lv.");
    }
}
