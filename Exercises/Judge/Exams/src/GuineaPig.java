import java.util.Scanner;
public class GuineaPig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double foodG = sc.nextDouble() * 1000;
        double hayG = sc.nextDouble() * 1000;
        double coverG = sc.nextDouble() * 1000;
        double weightG = sc.nextDouble() * 1000;

        boolean failed = false;

        for (int i = 1; i <= 30; i++) {
            if (foodG - 300 < 0 || hayG <= 0 || coverG <= 0) {
                failed = true;
                break;
            }

            foodG -= 300;

            if (i % 2 == 0) {
                hayG -= foodG * 0.05;
            }
            if (i % 3 == 0) {
                coverG -= weightG / 3;
            }
        }

        if (failed) {
            System.out.println("Merry must go to the pet store!");
        } else {
            foodG /= 1000;
            hayG /= 1000;
            coverG /= 1000;
           System.out.println("Everything is fine! Puppy is happy! Food: " +
                   String.format("%.2f", foodG)+ ", Hay: " +
                   String.format("%.2f", hayG) + ", Cover: " + String.format("%.2f", coverG) + ".");
        }


    }
}
