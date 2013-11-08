package Kata4;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
