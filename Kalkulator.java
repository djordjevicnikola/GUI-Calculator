package GUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kalkulator {
    private JTextField prviBroj;
    private JTextField drugiBroj;
    private JTextField rezultat;
    private JComboBox operacijaCombo;
    private JCheckBox zaokruzi;
    private JButton izracunajButton;
    private JPanel topPanel;

    public Kalkulator(){
    operacijaCombo.setEditable(true);
    for (String s : Operacija.operacije)operacijaCombo.addItem(s);
        izracunajButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                obradi();
            }
        });
    }
    public JTextField getPrviBroj() {
        return prviBroj;
    }

    public void setPrviBroj(JTextField prviBroj) {
        this.prviBroj = prviBroj;
    }

    public JTextField getDrugiBroj() {
        return drugiBroj;
    }

    public void setDrugiBroj(JTextField drugiBroj) {
        this.drugiBroj = drugiBroj;
    }

    public JTextField getRezultat() {
        return rezultat;
    }

    public void setRezultat(JTextField rezultat) {
        this.rezultat = rezultat;
    }

    public JComboBox getOperacija() {
        return operacijaCombo;
    }

    public void setOperacija(JComboBox operacija) {
        this.operacijaCombo = operacija;
    }

    public JCheckBox getZaokruzi() {
        return zaokruzi;
    }

    public void setZaokruzi(JCheckBox zaokruzi) {
        this.zaokruzi = zaokruzi;
    }

    public JButton getIzracunajButton() {
        return izracunajButton;
    }

    public void setIzracunajButton(JButton izracunajButton) {
        this.izracunajButton = izracunajButton;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }
    private void obradi(){
        double pb = Double.parseDouble(prviBroj.getText());
        double db = Double.parseDouble(drugiBroj.getText());
        String op = (String) operacijaCombo.getSelectedItem();
        Operacija o = new Operacija(op, pb, db);
        double rez = o.izracunaj();
        if(zaokruzi.isSelected()){
            int rezz = (int)rez;
            rezultat.setText(Integer.toString(rezz));
        }else{
            rezultat.setText(Double.toString(rez));
        }
    }
}
