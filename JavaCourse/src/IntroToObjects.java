import java.util.Scanner;

public class IntroToObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sc.next();
        greeting("Ivaylo", 10);
        int result = add2(15);
        System.out.println(result);

    }

    public static void greeting(String name, int x) {
       for (int i = 0; i < x; i++) {
           System.out.println("Hello, " +  name + "!");
       }
    }

    public static int add2(int x) {
        return x + 2;
    }
}
