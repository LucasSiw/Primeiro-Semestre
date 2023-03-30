package Lista1;

import javax.swing.*;

public class Atividade2 {
    public static void main(String[] args) {

        double Base, Altura, Area = 0;

        Base = Double.parseDouble(JOptionPane.showInputDialog("Informe a Base do Triangulo: "));
        Altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura do Triangulo: "));

        Area = Base*Altura;
        JOptionPane.showMessageDialog(null, "O valor do Triangulo é: "+ Area);
    }
}
