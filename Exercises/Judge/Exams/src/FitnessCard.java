import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();
        String gender = sc.next();
        int age = sc.nextInt();
        String sport = sc.next();

        double price = 0;

        if (gender.equals("m")) {
            switch (sport) {
                case "Gym": price = 42; break;
                case "Boxing": price = 41; break;
                case "Yoga": price = 45; break;
                case "Zumba": price = 34; break;
                case "Dances": price = 51; break;
                case "Pilates": price = 39; break;
            };
        } else {
            switch (sport) {
                case "Gym": price = 35; break;
                case "Boxing": price = 37; break;
                case "Yoga": price = 42; break;
                case "Zumba": price = 31; break;
                case "Dances": price = 53; break;
                case "Pilates": price = 37; break;
            };
        }

        if (age <= 19) {
            price -= price * 0.2;
        }

        String result;

        if (budget >= price) {
            result = "You purchased a 1 month pass for " + sport + ".";
        } else {
            result = "You don't have enough money! You need $" + (String.format("%.2f", price - budget)) + " more.";
        }

        System.out.println(result);
    }
}
