import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] list = str.split("!");
        List<String> itemsAsList = new ArrayList<>(Arrays.asList(list));
        String command = sc.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] explode = command.split(" ");
            String action = explode[0];
            String item = explode[1];

            if (action.equals("Urgent")) {
                if (!exists(itemsAsList, item)) {
                    itemsAsList.add(0, item);
                }
            } else if (action.equals("Unnecessary")) {
                if (exists(itemsAsList, item)) {
                    int index = itemsAsList.indexOf(item);
                    itemsAsList.remove(index);
                }
            } else if (action.equals("Correct")) {
                String newItem = explode[2];
                if (exists(itemsAsList, item)) {
                    int index = itemsAsList.indexOf(item);
                    itemsAsList.set(index, newItem);
                }
            } else if (action.equals("Rearrange")) {
                if (exists(itemsAsList, item)) {
                    int index = itemsAsList.indexOf(item);
                    itemsAsList.remove(index);
                    itemsAsList.add(item);
                }
            }

            command = sc.nextLine();
        }

        System.out.println(String.join(", ", itemsAsList));
    }

    public static boolean exists(List items, String item) {
        return items.contains(item);
    }
}
