package GUI;

import javax.swing.*;

public class Test {
    public static JFrame jf;
    public static void main(String[] args) {
    jf = new JFrame("Kalkulator");
    GUI m = new GUI();
    jf.setContentPane(m.getTopPanel());
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.pack();
    jf.setVisible(true);
    }
}
