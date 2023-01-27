import java.util.Scanner;

public class ForLoopsContinued {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Name: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String name:names) {
            System.out.println(name);

            if (name.equals("ivaylo")) {
                break;
            }
        }
    }
}
