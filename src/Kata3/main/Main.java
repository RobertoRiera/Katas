package Kata3.main;

import Kata3.control.CalculateHistogramControl;

public class Main {
    public static void main(String[] args){
        int [] data = {1,5,6,8,5,4,6,2,1,};
        CalculateHistogramControl control = new CalculateHistogramControl(data);
        control.execute();
    }
}
