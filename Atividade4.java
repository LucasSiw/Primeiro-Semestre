package ListaSe;

import javax.swing.*;

public class Atividade4 {
    public static void main(String[] args) {

        double salFixo, toVendas, salTotal;

        salFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionario: "));
        toVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas do funcionario: "));

        if(toVendas < 1500)
        {
            salTotal = salFixo+(toVendas*3/100);
            JOptionPane.showMessageDialog(null, "O salário do funcionario será: "+salTotal);
        }
        else {
            salTotal = salFixo+(toVendas*5/100);
            JOptionPane.showMessageDialog(null, "O salário do funcionario será: "+salTotal);
        }

    }
}