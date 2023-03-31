package Lista3;

import javax.swing.*;

public class Exer5 {
    public static void main(String[] args) {
        int Valor;

        Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        while (Valor<0) {
            Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor que 0:"));
        }
        for (int i=0;i<=Valor;i++)
        {
            System.out.println(i);
        }
    }
}
