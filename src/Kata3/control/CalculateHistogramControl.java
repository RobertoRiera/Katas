package Kata3.control;

import Kata3.model.HistogramBuilder;
import Kata3.ui.HistogramViewer;

public class CalculateHistogramControl<T> {
    
    private T[] data;

    public CalculateHistogramControl(T[] data) {
        this.data = data;
    }
    
    public void execute (){
        HistogramBuilder builder = new HistogramBuilder();
        builder.calculate(data);
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
