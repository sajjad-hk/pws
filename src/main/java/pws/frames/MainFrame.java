package pws.frames;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pws.view.builder.ViewBuilder;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(XSSFWorkbook workbook) {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(400, 300));
        ViewBuilder.build(workbook, this.getContentPane());
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}

