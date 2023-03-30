package ListaSe;

import javax.swing.*;

public class Atividade1 {
    public static void main(String[] args) {

        int Valor;

        Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
        if(Valor > 10)
        {
            JOptionPane.showMessageDialog(null, "O valor e Maior que 10");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O valor e Menor que 10");
        }
    }
}
