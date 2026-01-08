import java.util.*;

public class collections2 {
    public static void main(String[] args) {

            String text = "java is easy and java is powerful";

            HashMap<String, Integer> map = new HashMap<>();

            for (String word : text.split(" ")) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(map.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
