import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapsExercise {
    public static void main(String[] args) {
        String[] sequence = {"a", "d", "d", "s", "e", "l", "q", "a", "j", "d", "t", "n", "l", "q"};
        Map lettersCount = new HashMap();

        for (String letter: sequence) {
            if (lettersCount.containsKey(letter)) {
                int currentVal = (int) lettersCount.get(letter);
                currentVal++;
                lettersCount.put(letter, currentVal);
            } else {
                lettersCount.put(letter, 1);
            }
        }

        for (Object key: lettersCount.keySet()) {
            int value = (int) lettersCount.get(key);
            System.out.println(key + " -> " + value + " repetitions");
        }


    }
}
