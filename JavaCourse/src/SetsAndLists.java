import java.util.*;

public class SetsAndLists {
    public static void main(String[] args) {
//        Set<Integer> s = new LinkedHashSet<>();
//        s.add(5);
//        s.add(1);
//        s.add(4);
//        s.add(7);
//        s.add(8);
//
//        boolean x = s.contains(5);
//        s.remove(1);
//        System.out.println(s.isEmpty());
//        System.out.println(s.size());
//
//
//        System.out.println(x);
//        System.out.println(s);

        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(4);
        x.add(7);
        x.add(9);
        x.add(9);
        x.add(9);
        x.add(9);
        x.add(9);

        x.remove(3);
        System.out.println(x.isEmpty());
        System.out.println(x.get(1));
        x.set(0, 12);
        System.out.println(x.isEmpty());

        System.out.println(x.subList(2, 5));

        System.out.println(x);

    }
}
