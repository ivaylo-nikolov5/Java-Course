import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = Integer.parseInt(sc.nextLine());
        String path = sc.nextLine();

        int result = countValleys(steps, path);
        System.out.println(result);
    }

    private static int countValleys(int steps, String path) {
        int valleys = 0;
        int prevLevel = 0;
        int level = 0;

        for (int i = 0; i < path.length(); i++) {
            String currentDirection = String.valueOf(path.charAt(i));
            prevLevel = level;

            if (currentDirection.equals("U")) level++;
            else level--;

            if (level == 0 && prevLevel < 0) {
                valleys++;
            }

        }

        return valleys;
    }

}
