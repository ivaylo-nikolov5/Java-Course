import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int food = sc.nextInt() * 1000;
        String currentFoodAmount = sc.next();

        while (!currentFoodAmount.equals("Adopted")) {
            int foodGrams = Integer.parseInt(currentFoodAmount);
            food -= foodGrams;
            currentFoodAmount = sc.next();
        }

        if (food >= 0) {
            System.out.println("Food is enough! Leftovers: " + food + " grams.");
        } else {
            int diff = Math.abs(food);
            System.out.println("Food is not enough. You need " + diff + " grams more.");
        }
    }
}
