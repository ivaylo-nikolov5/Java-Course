public class ConditionsAndBooleans {
    public static void main(String[] args) {
        int x = 25;
        int y = 21;
        int z = 10;
//      > < == >= <= !=
        boolean compare;
        compare = x != y || z < y;
        System.out.println(compare);
    }
}
