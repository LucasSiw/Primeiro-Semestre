package Lista1;

import javax.swing.*;

public class Atividade5 {
    public static void main(String[] args) {

        float Salario, vReajuste, Rejuste, salarioFinal = 0;

        Salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu Sálario atual: "));
        vReajuste = Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual de reajuste: "));

        Rejuste = Salario * vReajuste/100;
        salarioFinal = Salario+Rejuste;

        JOptionPane.showMessageDialog(null, "O salario final será de: "+salarioFinal);
    }
}
