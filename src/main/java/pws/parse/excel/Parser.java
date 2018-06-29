package pws.parse.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Parser {

    public static final String XLSX_FILE_PATH = "resources/pwp.xlsx";




    public Parser() {


        try {
            new XSSFWorkbook();
            InputStream fileInputStream = new FileInputStream(XLSX_FILE_PATH);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
            for(Sheet sheet : workbook) {
                for(Row row: sheet) {
                    System.out.println(row.getCell(0));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }






    }



}
