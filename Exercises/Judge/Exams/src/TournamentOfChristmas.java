import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        double total = 0;
        int totalWins = 0;
        int totalLoses = 0;

        for (int i = 0; i < days; i++) {
            String sport = sc.nextLine();
            String condition = sc.nextLine();

            int currentWins = 0;
            int currentLoses = 0;
            double wonMoney = 0;

            while (!sport.equals("Finish")) {
                if (condition.equals("win")) {
                    currentWins++;
                    wonMoney += 20;
                } else {
                    currentLoses++;
                }


                sport = sc.nextLine();
                if (sport.equals("Finish")) {
                    continue;
                }
                condition = sc.nextLine();
            }

            if (currentWins > currentLoses) {
                wonMoney += wonMoney * 0.1;
            }

            totalWins += currentWins;
            totalLoses += currentLoses;
            total += wonMoney;
        }

        boolean won = false;

        if (totalWins > totalLoses) {
            won = true;
            total += total * 0.2;
        }

        String condition = (won) ? "won" : "lost";

        System.out.println("You " + condition + " the tournament! Total raised money: " + String.format("%.2f", total));
    }
}
