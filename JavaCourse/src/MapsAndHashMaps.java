import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsAndHashMaps {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("ivaylo", 17);
        m.put("joe", 1);
        m.put("bob", 999);

        boolean containsK = m.containsKey("ivaylo");
        boolean containsV = m.containsValue(17);
        System.out.println(containsK);
        System.out.println(m.keySet());
        System.out.println(m.values());
    }
}
