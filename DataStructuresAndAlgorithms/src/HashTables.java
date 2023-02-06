import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(21);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for (String key: table.keySet()) {
            System.out.println(key.hashCode() % 21 + " " + key + "\t" + table.get(key));
        }
    }
}
