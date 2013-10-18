package Kata3;

import java.util.HashMap;

public class HistogramViewer {
    private HashMap<Integer, Integer> histogram;

    public HistogramViewer(HashMap<Integer, Integer> histogram) {
        this.histogram = histogram;
    }
    public void show(){
        for (Object key : histogram.keySet()) {
            System.out.println(key + ": " + histogram.get(key));
        }
    }
    
}

