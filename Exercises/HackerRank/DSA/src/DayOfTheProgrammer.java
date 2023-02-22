import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        String result = dayOfProgrammer(year);
        System.out.println(result);
    }

    private static String dayOfProgrammer(int year) {
        boolean isLeap = year % 400 == 0 || (year % 4 == 0 && (year % 100) != 0);
        if (year < 1919 && year % 4 == 0) isLeap = true;
        String day = (isLeap) ? "12" : "13";
        if (year == 1918) day = "" + (Integer.parseInt(day) + 13);
        return day + "." + "09" + "." + year;
    }
}
