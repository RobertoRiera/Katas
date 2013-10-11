package Kata1;

import java.util.HashMap;

public class UseHashMap {
    static HashMap<String, Integer> histogram = new HashMap();

    public static void main(String[] args) {
        String[] key = {"Juan", "Pedro", "Ana", "Pedro", "Pedro"};
        for (String name : key) {
            histogram.put(name, getFrecuency(name) + 1);
        }
    }
    
    public static int getFrecuency(String name) {
        if (histogram.containsKey(name)) {
            return histogram.get(name);
        }
        return 0;
    }
}