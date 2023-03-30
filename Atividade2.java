package ListaSe;

import javax.swing.*;

public class Atividade2 {
    public static void main(String[] args) {

        int Valor;

        Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

        if(Valor >= 0)
        {
            JOptionPane.showMessageDialog(null, "Valor Positivo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor Negativo");
        }
    }
}
