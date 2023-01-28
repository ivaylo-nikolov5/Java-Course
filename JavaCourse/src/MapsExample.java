import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
//        Map m = new HashMap();
//        String str = "hello my name is Ivaylo and I am a programmer";
//
//        for (char i : str.toCharArray()) {
//            if (m.containsKey(i)) {
//                int old = (int) m.get(i);
//                m.put(i, old + 1);
//            } else {
//                m.put(i, 1);
//            }
//        }
//        m.remove(" ");
//        System.out.println(m);

        int[] x = {2, 3 ,5 ,21, 3, 7, 5, 1, 8, 12, 2};
        Arrays.sort(x);

        for (int i: x) {
            System.out.print(i + ", ");
        }
    }
}
