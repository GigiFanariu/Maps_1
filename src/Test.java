import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer, String> firstMap = new HashMap<>();
        firstMap.put(1, "One");
        firstMap.put(2, "Two");
        firstMap.put(3, "Three");
        firstMap.put(4, "Four");
        firstMap.put(5, "Five");

        HashMap<Integer, String> secondMap = new HashMap<>();
        secondMap.put(1, "Uno");
        secondMap.put(2, "Due");
        secondMap.put(3, "Tre");
        secondMap.put(4, "Quattro");
        secondMap.put(5, "Cinque");
        secondMap.put(6, "Sei");
        secondMap.put(7, "Sette");
        secondMap.put(8, "Otto");
        secondMap.put(9, "Nove");

        for (Map.Entry<Integer, String> entry : secondMap.entrySet()) {
            int Key = entry.getKey();
            String value = entry.getValue();
            firstMap.put(Key, value);
        }
        System.out.println("modified first map" + firstMap);

        int[] keysToPrint = {5, 6, 7, 8, 9};
        for (int key : keysToPrint) {
            if (firstMap.containsKey(key)) {
                System.out.println("Value for key " + key + ": " + firstMap.get(key));
            } else {
                System.out.println("No associated value for key " + key);
            }
        }
    }
}
