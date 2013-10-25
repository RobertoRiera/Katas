//Los modulos de control siempre llevan execute
package Kata3.control;

import Kata3.model.HistogramBuilder;
import Kata3.persistence.MailReader;
import Kata3.ui.HistogramViewer;

public class CalculateEmailDomainHistogramControl {
        
    private String filename;

    public CalculateEmailDomainHistogramControl(String filename) {
        this.filename = filename;
    }
        
    public void execute(){
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(readDomains());
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
        
    }

    private String[] readDomains() {
        MailReader reader = new MailReader();
        try {
            return reader.readDomains(filename);
        } catch (Exception e) {
            return new String[0];
            
        }
              
    }
    
    
}
