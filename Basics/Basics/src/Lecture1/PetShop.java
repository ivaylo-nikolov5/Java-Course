package Lecture1;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = dogFoodPackages * 2.5;
        double catFoodPrice = catFoodPackages * 4;

        double total = dogFoodPrice + catFoodPrice;

        System.out.printf("%s lv.", total);


    }

}
