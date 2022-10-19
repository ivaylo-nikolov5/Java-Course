package Lecture1;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inches = Integer.parseInt(scanner.nextLine());
        double centimeters = inches * 2.54;

        System.out.println(centimeters);
    }
}
