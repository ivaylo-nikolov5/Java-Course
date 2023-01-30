import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();
        double totalPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groups; i++) {
            int group = sc.nextInt();

            if (group >= 41) {
                everest += group;
            } else if (group >= 26) {
                k2 += group;
            } else if (group >= 13) {
                kilimanjaro += group;
            } else if (group >= 6) {
                monblan += group;
            } else {
                musala += group;
            }

            totalPeople += group;
        }

        double musalaPercentage = musala / totalPeople * 100;
        double monblanPercentage = monblan / totalPeople * 100;
        double kilimanjaroPercentage = kilimanjaro / totalPeople * 100;
        double k2Percentage = k2 / totalPeople * 100;
        double everestPercentage = everest / totalPeople * 100;

        System.out.println(String.format("%.2f", musalaPercentage) + "%");
        System.out.println(String.format("%.2f", monblanPercentage) + "%");
        System.out.println(String.format("%.2f", kilimanjaroPercentage) + "%");
        System.out.println(String.format("%.2f", k2Percentage) + "%");
        System.out.println(String.format("%.2f", everestPercentage) + "%");

    }
}
