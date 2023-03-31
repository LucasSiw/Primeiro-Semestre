package Lista3;

import javax.swing.*;

public class Exer8 {
    public static void main(String[] args) {

        int[] Valor = new int[10];
        for (int i=0;i<10;i++)
        {
            Valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
            if (Valor[i]<0)
            {
                System.out.println(Valor[i]);
            }
        }
    }
}
