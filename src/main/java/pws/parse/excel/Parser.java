package pws.parse.excel;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Parser {

    public static final String XLSX_FILE_PATH = "resources/pwp.xlsx";
    private XSSFWorkbook workbook;


    public Parser() throws IOException {

        try (InputStream fileInputStream = new FileInputStream(XLSX_FILE_PATH)) {
            this.workbook = new XSSFWorkbook(fileInputStream);
        }
    }

    public XSSFWorkbook parse() throws IOException {
        return new Parser().workbook;
    }
}
