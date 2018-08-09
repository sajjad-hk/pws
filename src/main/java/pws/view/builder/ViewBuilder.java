package pws.view.builder;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pws.view.RoundButton;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public interface ViewBuilder {

    static void build (XSSFWorkbook workbook, Container pan) {
        JTabbedPane cards = new JTabbedPane();
        for (Sheet sheet : workbook) {
            String name = sheet.getSheetName();
            JPanel panel = buildCard(sheet);
            cards.addTab(name, panel);
        }
        pan.add(cards, BorderLayout.CENTER);

    }

    static JPanel buildCard(Sheet sheet) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);
        int i = 0;
        for(Row row: sheet) {
            JLabel label = new JLabel(row.getCell(0).toString());
            JButton btnCpy = new RoundButton("Cpy");
            JButton btnShw = new RoundButton("Show");
            c.gridx = i;
            c.gridy = 0;
            btnCpy.addActionListener(e -> {
                String myString = row.getCell(1).toString();
                StringSelection stringSelection = new StringSelection(myString);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            });
            btnShw.addActionListener(e -> {
                String myString = row.getCell(1).toString();
                btnShw.setText(myString);
            });
            panel.add(label, c);
            c.gridy = 1;
            panel.add(btnCpy, c);
            c.gridy = 2;
            panel.add(btnShw, c);
            i++;

        }
        return panel;
    }

}
