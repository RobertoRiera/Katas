package Kata3;

import java.util.HashMap;

public class HistogramBuilder {

    public HashMap<Integer, Integer> histogram;

    public HistogramBuilder() {
        this.histogram = new HashMap<>();

    }
    public void calculate(int[] data){
        for (int item : data) {
            histogram.put(item, getCount(item) + 1);
        }
        
    }
    private int getCount(int item){
        if (histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }

    public HashMap<Integer, Integer> getHistogram() {
        return histogram;
    }
    
}
