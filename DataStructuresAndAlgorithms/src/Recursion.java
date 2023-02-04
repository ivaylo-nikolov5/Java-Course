public class Recursion {
    public static void main(String[] args) {
        long result = power(2, 8);
        System.out.println(result);
    }

    private static long factorial(int number) {
        if (number < 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }



    private static long power(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return number * power(number, power - 1);
    }
}
