import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> birds = convertStrToList(sc.nextLine().split(" "));
        int result = migratoryBirds(birds);
        System.out.println(result);

    }

    private static List<Integer> convertStrToList(String[] stringArray) {
        List<Integer> currentList = new ArrayList<Integer>();

        for (String el: stringArray) {
            currentList.add(Integer.parseInt(el));
        }

        return currentList;
    }


    private static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> birdTypes = new HashMap<>();
        int res = 0;

        for (int bird: arr) {
            if (!birdTypes.containsKey(bird)) {
                birdTypes.put(bird, 1);
            } else {
                birdTypes.put(bird, birdTypes.get(bird) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : birdTypes.entrySet()) {
            if (res == 0 || entry.getValue() > birdTypes.get(res)) {
                res = entry.getKey();
            }
        }

        return res;
    }
}
