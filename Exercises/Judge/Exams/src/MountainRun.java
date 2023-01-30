import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double recordInSeconds = sc.nextDouble();
        double distanceInMeters = sc.nextDouble();
        double timeInSeconds = sc.nextDouble();

        double time = distanceInMeters * timeInSeconds;
        time += Math.floor(distanceInMeters / 50) * 30;

        double diff = Math.abs(time - recordInSeconds);
        String result;

        if (time >= recordInSeconds) {
           result = "No! He was " + String.format("%.2f", diff) + " seconds slower.";
        } else {
           result = "Yes! The new record is "+ String.format("%.2f", time) +" seconds.";
        }

        System.out.println(result);
    }
}
