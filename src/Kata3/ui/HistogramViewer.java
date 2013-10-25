//El .keySet devuelve las claves del histograma
//El .get(key) devuelve el valor que corresponde con la key (key)
package Kata3.ui;

import Kata3.model.Histogram;

public class HistogramViewer<T> {
    private Histogram<T> histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }
    public void show(){
        for (Object key : histogram.keySet()) {
            System.out.println(key + ": " + histogram.get(key));
        }
    }
    
} 

