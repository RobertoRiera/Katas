package Kata3.model;

public class HistogramBuilder<T> {

    public Histogram<T> histogram;

    public void calculate(T[] data){
        histogram = new Histogram();
        for (T item : data) {
            histogram.put(item, getCurrentCount(item) + 1);
        }
        
    }
    private int getCurrentCount(T item){
        if (histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }

    public Histogram<T> getHistogram() {
        return histogram;
    }
    
}
