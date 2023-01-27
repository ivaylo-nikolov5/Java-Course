import java.util.Scanner;

public class NestedStatements {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.print("Input your fav food: ");
            String food = sc.nextLine();

            if (food.equals("pizza")) {
                System.out.println("Mine too");
            } else {
                System.out.println("Not mine");
            }

        } else if (age >= 13){
            System.out.println("You are an teenager!");
        } else {
            System.out.println("You are not a teenager or am adult!");
        }

    }
}
