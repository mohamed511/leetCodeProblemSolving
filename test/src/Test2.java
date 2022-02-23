import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {

    public static void main(String[] args) {
        // disagree 0
        // one value of letter an
        String[] s1 = {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};
        String[] s2 = {"Z:0", "A:-1"};
        String[] s3 = {"B:-1", "A:1", "B:3", "A:5"};
        System.out.println(SearchingChallenge(s1));
        System.out.println(SearchingChallenge(s2));
        System.out.println(SearchingChallenge(s3));
    }

    public static String SearchingChallenge(String[] strArr) {
        Map<String, Integer> map = new TreeMap<>();
        // code goes here
        for (int i = 0; i < strArr.length; i++) {
            String temp = strArr[i];
            String letter = temp.substring(0, temp.indexOf(":"));
            Integer number = Integer.valueOf(temp.substring(temp.indexOf(":") + 1));

            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + number);
            } else {
                map.put(letter, number);
            }
        }
        //Map<String, Integer> sortedMap = new TreeMap<>(map);
        return convertToString(map);
    }

    public static String convertToString(Map<String, Integer> map) {
        StringBuilder mapAsString = new StringBuilder("");
        boolean isEmpty = true;
        for (String key : map.keySet()) {
            if (map.get(key) !=0) {
                mapAsString.append(key + ":" + map.get(key) + ",");
                isEmpty = false;
            }
        }
        if (!isEmpty) {
            mapAsString.delete(mapAsString.length() - 1, mapAsString.length()).append("");
        }
        return mapAsString.toString();
    }

}
