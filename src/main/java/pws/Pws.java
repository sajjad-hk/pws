package pws;

import pws.frames.MainFrame;

import javax.swing.*;

public class Pws {

    public static void main(String[]args){
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
