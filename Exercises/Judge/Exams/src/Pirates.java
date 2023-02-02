import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        HashMap<String, Integer> citiesPopulation = new HashMap<String, Integer>();
        HashMap<String, Integer> citiesGold = new HashMap<String, Integer>();

        while (!command.equals("Sail")) {
            String[] explode = command.split("\\|\\|");
            String city = explode[0];
            int population = Integer.parseInt(explode[1]);
            int gold = Integer.parseInt(explode[2]);
            if (!alreadyExists(citiesPopulation, city)) {
                citiesPopulation.put(city, 0);
                citiesGold.put(city, 0);
            }
            int oldPopulation = citiesPopulation.get(city);
            int oldGold = citiesGold.get(city);

            citiesPopulation.put(city, oldPopulation + population);
            citiesGold.put(city, oldGold + gold);

            command = sc.nextLine();
        }

        command = sc.nextLine();

        while (!command.equals("End")) {
            String[] explode = command.split("=>");
            String action = explode[0];
            String city = explode[1];

            if (action.equals("Plunder")) {
                int people = Integer.parseInt(explode[2]);
                int gold = Integer.parseInt(explode[3]);

                plunder(citiesPopulation, citiesGold, people, gold, city);
            } else {
                int gold = Integer.parseInt(explode[2]);
                prosper(citiesGold, gold, city);

            }

            command = sc.nextLine();
        }

        printFinalResult(citiesPopulation, citiesGold);
    }

    private static boolean alreadyExists(HashMap<String, Integer> data, String entity) {
        return data.containsKey(entity);
    }

    private static void plunder(HashMap<String, Integer> population,
                                HashMap<String, Integer> gold,
                                int people, int gold_, String city) {
        int oldPeople = population.get(city);
        int oldGold = gold.get(city);

        population.put(city, oldPeople - people);
        gold.put(city, oldGold - gold_);

        System.out.println(city + " plundered! " +
                gold_ + " gold stolen, " + people + " citizens killed.");

        if (population.get(city) > 0 && gold.get(city) > 0) {
            return;
        }

        population.remove(city);
        gold.remove(city);

        System.out.println(city + " has been wiped off the map!");
    }

    private static void prosper(HashMap<String, Integer> gold,
                                int gold_, String city) {

        if (gold_ < 0) {
            System.out.println("Gold added cannot be a negative number!");
            return;
        }

        int oldGold = gold.get(city);
        gold.put(city, oldGold + gold_);
        System.out.println(
                gold_ + " gold added to the city treasury. " +
                        city + " now has " + gold.get(city) + " gold."
        );
    }

    private static void printFinalResult(HashMap<String, Integer> population,
                                         HashMap<String, Integer> gold) {
        if (population.size() < 1) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
            return;
        }

        System.out.println("Ahoy, Captain! There are " + population.size() + " wealthy settlements to go to: ");
        for (Map.Entry<String, Integer> entry: population.entrySet()) {
            String city = entry.getKey();
            int cityPopulation = entry.getValue();
            int cityGold = gold.get(city);

            System.out.println(
                    city + " -> Population: " + cityPopulation + " citizens, Gold: " + cityGold + " kg"
            );
        }
    }
}
