package Lista3;

import javax.swing.*;

public class Exer7 {
    public static void main(String[] args) {

        int Valor;
         Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
         for (int i=0;i<=10;i++)
         {
             System.out.println(Valor*i);
         }
    }
}
