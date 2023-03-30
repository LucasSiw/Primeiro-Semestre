package ListaSe;

import javax.swing.*;

public class Atividade3 {
    public static void main(String[] args) {

        double Valor = 0;
        int qntComprada;

        qntComprada = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade comprada: "));
        if (qntComprada < 12) {
            Valor = qntComprada*1.30;
        } else if (qntComprada >= 12) {
            Valor = qntComprada*1.00;
        }
        JOptionPane.showMessageDialog(null, "O valor final é R$ "+Valor);
    }
}
