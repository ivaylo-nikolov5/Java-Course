import java.util.Stack;

public class StackPart {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Forza Horizon 5");
        stack.push("Counter-Strike: Global Offensive");
        stack.push("Fortnite");

        String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(myFavGame);
        System.out.println(stack.search("Minecraft"));

        for (int i = 0; i < 10000000; i++) {
            stack.push("Fallout76");
        }

    }
}
