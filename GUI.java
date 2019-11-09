package GUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {
    private JButton logIn;
    private JTextField username;
    private JPasswordField password;
    private JPanel topPanel;

    public GUI() {
        logIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String unetiUsername = username.getText();
                char[] Password = password.getPassword();
                String unetiPassword = new String(Password);
                if("nikola".equals(unetiUsername) && "123".equals(unetiPassword)){
                  prikaziKalkulator();
                } else{
                    JOptionPane.showMessageDialog(Test.jf, "Nisu dobri kredencijali!");
                }
            }
        });
    }
    public void prikaziKalkulator(){
    Kalkulator k = new Kalkulator();
    Test.jf.setContentPane(k.getTopPanel());
        Test.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Test.jf.pack();
        Test.jf.setVisible(true);
    }
    public JButton getLogIn() {
        return logIn;
    }

    public void setLogIn(JButton logIn) {
        this.logIn = logIn;
    }

    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }
}
