package ListaSe;

import javax.swing.*;

public class Atividade10 {
    public static void main(String[] args) {

        String sexo, nome;
        double altura, peso = 0;

        nome = JOptionPane.showInputDialog( "Qual seu nome: ");
        sexo = JOptionPane.showInputDialog("Qual seu sexo, responda utilizando M ou F: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura: "));

        if (sexo == "M" || sexo == "m") {
            peso = (72.7*altura) - 58;
            JOptionPane.showMessageDialog(null,"O peso ideal é: "+ peso);
        }
        else {
            peso = (62.1*altura) - 44.7;
            JOptionPane.showMessageDialog(null, "O peso ideal é: "+ peso);
        }
    }
}
