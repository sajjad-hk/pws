package pws.parse.excel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Parser {

    public static final String XLSX_FILE_PATH = "resources/pwp.xlsx";




    public Parser(JPanel panel) {

        try {
            InputStream fileInputStream = new FileInputStream(XLSX_FILE_PATH);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
            createBaseLayout(workbook, panel, workbook.getNumberOfSheets());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void createBaseLayout(XSSFWorkbook wb, JPanel panel, int n) {
        for(Sheet sheet : wb) {

            GridBagConstraints c = new GridBagConstraints();
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = 1/n;
            c.ipady = 40;
            JButton btn = new JButton(sheet.getSheetName());
            panel.add(btn, c);
        }
    }



}
