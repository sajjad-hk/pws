package pws.view.builder;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.awt.*;

public interface ViewBuilder {

    static void build (XSSFWorkbook workbook, Container pan) {
        JTabbedPane cards = new JTabbedPane();
        for (Sheet sheet : workbook) {
            String name = sheet.getSheetName();
            JPanel panel = new JPanel();
            cards.addTab(name, panel);

            System.out.println("-" + sheet.getSheetName());
        }
        pan.add(cards, BorderLayout.CENTER);

    }

}
