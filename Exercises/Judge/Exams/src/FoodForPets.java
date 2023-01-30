import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        double food = sc.nextDouble();
        double biscuits = 0;
        int totalEatenFood = 0;
        double dogFood = 0;
        double catFood = 0;

        for (int i = 1; i <= days; i++) {
            int foodEatenByDog = sc.nextInt();
            int foodEatenByCat = sc.nextInt();
            int currentTotal = foodEatenByCat + foodEatenByDog;
            totalEatenFood += currentTotal;

            dogFood += foodEatenByDog;
            catFood += foodEatenByCat;
            if (i % 3 == 0) {
                biscuits += currentTotal * 0.1;
            }
        }

        double percentageEatenFood = totalEatenFood / food * 100;
        double dogPercentage = dogFood / totalEatenFood * 100;
        double catPercentage = catFood / totalEatenFood * 100;
        biscuits = Math.round(biscuits);

        System.out.println("Total eaten biscuits: " + (int)biscuits + "gr.");
        System.out.println(String.format("%.2f", percentageEatenFood) + "% of the food has been eaten.");
        System.out.println(String.format("%.2f", dogPercentage) + "% eaten from the dog.");
        System.out.println(String.format("%.2f", catPercentage) + "% eaten from the cat.");
    }
}
