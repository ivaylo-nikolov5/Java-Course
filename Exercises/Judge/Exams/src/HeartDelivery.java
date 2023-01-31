import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("@");
        int[] neighborhood = convertToInt(line);
        String command = sc.nextLine();
        int currentPosition = 0;

        while (!command.equals("Love!")) {
            String[] explode = command.split(" ");
            int length = Integer.parseInt(explode[1]);
            currentPosition += length;
            if (currentPosition > neighborhood.length - 1) {
                currentPosition = 0;
            }

            if (neighborhood[currentPosition] <= 0) {
                System.out.println("Place " + currentPosition + " already had Valentine's day.");
            } else {
                neighborhood[currentPosition] -= 2;

                if (neighborhood[currentPosition] <= 0) {
                    System.out.println("Place " + currentPosition + " has Valentine's day.");
                }
            }

            command = sc.nextLine();
        }
        int failedPlaces = countFailedPlaces(neighborhood);

        System.out.println("Cupid's last position was " + currentPosition + ".");

        if (failedPlaces > 0) {
            System.out.println("Cupid has failed " + failedPlaces + " places.");
        } else {
            System.out.println("Mission was successful.");
        }

    }

    private static int[] convertToInt(String[] arr) {
        int[] neighborhood = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            neighborhood[i] = Integer.parseInt(arr[i]);
        }

        return neighborhood;
    }

    private static int countFailedPlaces(int[] list) {
        int failedPlaces = 0;

        for (int house: list) {
            if (house > 0) {
                failedPlaces++;
            }
        }

        return failedPlaces;
    }
}
