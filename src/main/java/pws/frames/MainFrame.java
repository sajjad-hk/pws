package pws.frames;


import pws.parse.excel.Parser;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(400, 200));
        Parser p = new Parser();
//        Label empty = new Label("Pv Storage");
//        this.getContentPane().add(empty, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}