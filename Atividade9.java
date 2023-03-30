package ListaSe;

import javax.swing.*;

public class Atividade9 {
    public static void main(String[] args) {

        float horaTrab, salHora, salario, valorExtra;

        horaTrab = Float.parseFloat(JOptionPane.showInputDialog("Digite quantidade de Horas Trabalhadas: "));
        salHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));

        if(horaTrab >= 40) {
            salario = horaTrab * salHora;
            salario = salHora + (salHora*50/100);
            JOptionPane.showMessageDialog(null, "O salario do funcionario é: "+salario);
        }
        else {
            salario = horaTrab * salHora;
            JOptionPane.showMessageDialog(null, "O salario do funcionario é: "+ salario);
        }
    }
}
