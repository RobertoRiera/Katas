package Kata3;

public class Main {
    public static void main(String[] args){
        HistogramBuilder builder = new HistogramBuilder();
        builder.calculate(new int[] {1,2,1,3,1,4,8,20,4,5,6,3} );
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
