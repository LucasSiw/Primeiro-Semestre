package Lista1;

import javax.swing.*;

public class Ativade3 {
    public static void main(String[] args) {

        int Ano, Meses, Dias;
        int diasAno = 0, diaMeses = 0, diaDias = 0;

        Ano = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade em Ano que você nasceu: "));
        Meses = Integer.parseInt(JOptionPane.showInputDialog("Informe o Mês que você nasceu: "));
        Dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia que você nasceu: "));
        diasAno = Ano*365;
        diaMeses = Meses*30;
        diaDias = Dias+diaMeses+diasAno;

        JOptionPane.showMessageDialog(null, "A sua idade me dias é: "+diaDias);
    }
}
