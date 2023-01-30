import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutesPerDay = sc.nextInt();
        int dailyWalks = sc.nextInt();
        int caloriesPerDay = sc.nextInt();

        int totalMinutes = minutesPerDay * dailyWalks;
        int burntCalories = totalMinutes * 5;
        double halfConsumedCalories = caloriesPerDay / 2;

        String result;

        if (burntCalories >= halfConsumedCalories) {
            result = "Yes, the walk for your cat is enough. ";
        } else {
            result = "No, the walk for your cat is not enough. ";
        }

        result += "Burned calories per day: " + burntCalories + ".";
        System.out.println(result);
    }
}
