package pws;

import pws.frames.MainFrame;
import pws.parse.excel.Parser;

import javax.swing.*;
import java.io.IOException;

public class Pws {

    public static void main(String[]args){
        try {
            Parser parser = new Parser();
            SwingUtilities.invokeLater(() -> {
                try {
                    new MainFrame(parser.parse());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
