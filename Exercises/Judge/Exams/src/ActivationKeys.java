import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String command = sc.nextLine();

        while (!command.equals("Generate")) {
            String[] explode = command.split(">>>");
            String action = explode[0];

            if (action.equals("Contains")) {
                String substring = explode[1];
                contains(str, substring);

            } else if (action.equals("Flip")) {
                String type = explode[1];
                int startIdx = Integer.parseInt(explode[2]);
                int endIdx = Integer.parseInt(explode[3]);
                str = changeLettersType(str, type, startIdx, endIdx);
                System.out.println(str);

            } else if (action.equals("Slice")) {
                int startIdx = Integer.parseInt(explode[1]);
                int endIdx = Integer.parseInt(explode[2]);
                str = sliceString(str, startIdx, endIdx);

            }


            command = sc.nextLine();
        }

        System.out.println("Your activation key is: " + str);
    }

    private static void contains(String str, String substring) {
        if (str.contains(substring)) {
            System.out.println(str + " contains " + substring);
        } else {
            System.out.println("Substring not found!");
        }
    }

    private static String changeLettersType(String str, String type, int startIdx, int endIdx) {
        String newStr = str.substring(0, startIdx);
        String modifyPart = str.substring(startIdx, endIdx);
        modifyPart = (type.equals("Upper")) ? modifyPart.toUpperCase() : modifyPart.toLowerCase();
        newStr += modifyPart;
        newStr += str.substring(endIdx);

        return newStr;
    }

    private static String sliceString(String str, int startIdx, int endIdx) {
        String newStr = str.substring(0, startIdx);
        newStr += str.substring(endIdx);
        System.out.println(newStr);

        return newStr;
    }

}
