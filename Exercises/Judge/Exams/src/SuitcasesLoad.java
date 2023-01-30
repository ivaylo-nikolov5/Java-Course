import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double trunkCapacity = sc.nextDouble();
        String suitcase = sc.next();
        int totalSuitcases = 1;
        boolean allLoaded = true;

        while (!suitcase.equals("End")) {
            double doubleSuitcase = Double.parseDouble(suitcase);

            if (totalSuitcases % 3 == 0) {
                doubleSuitcase += doubleSuitcase * 0.1;
            }

            if (doubleSuitcase > trunkCapacity) {
                allLoaded = false;
                break;
            }

            totalSuitcases++;
            trunkCapacity -= doubleSuitcase;

            suitcase = sc.next();
        }
        String result = "";

        if (allLoaded) {
            result += "Congratulations! All suitcases are loaded!\n";
        } else {
            result += "No more space!\n";
        }

        result += "Statistic: " + (totalSuitcases - 1) + " suitcases loaded.";
        System.out.println(result);
    }
}
