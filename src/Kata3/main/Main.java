package Kata3.main;

import Kata3.control.CalculateEmailDomainHistogramControl;
import Kata3.control.CalculateHistogramControl;

public class Main {
    public static void main(String[] args){
        Integer [] data = {1,5,6,8,5,4,6,2,1,};
        CalculateHistogramControl<Integer> control = new CalculateHistogramControl(data);
        control.execute();
        String filename = ("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Katas\\src\\Kata3\\Correos");
        CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
    }
}
