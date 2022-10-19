package Lecture1;

import com.sun.jdi.DoubleValue;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double totalCost = squareMeters * 7.61;
        double discount = totalCost * 0.18;
        totalCost -= discount;

        System.out.printf("The final price is: %s lv.%n", totalCost);
        System.out.printf("The discount is: %s lv.", discount);

    }
}
