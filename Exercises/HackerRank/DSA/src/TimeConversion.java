import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = convertMilitary(sc.nextLine());
        System.out.println(time);
    }

    private static String convertMilitary(String s) {
        String[] time = s.split(":");

        int hh = Integer.parseInt(time[0]);
        int ss = Integer.parseInt(sliceString(time[2], 0));
        String amOrPm = sliceString(time[2], 2);

        hh = (amOrPm.equals("PM")) ? hh + 12 : hh % 12;

        if (hh == 24) {
            hh = 12;
        }

        return formatTime(hh) + ":" + time[1] + ":" + formatTime(ss);
    }

    private static String sliceString(String str, int start) {
        String[] arr = new String[2];
        arr[0] = String.valueOf(str.charAt(start));
        arr[1] = String.valueOf(str.charAt(start + 1));

        return String.join("", arr);
    }

    private static String formatTime(int time) {
        String leadingZero = (time < 10) ? "0" : "";
        return leadingZero + time;
    }

}
