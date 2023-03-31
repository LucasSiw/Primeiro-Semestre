package Lista3;

import javax.swing.*;

public class Exer4 {
    public static void main(String[] args) {

        int Valor;

        Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        if(Valor>0) {
            for (int i=0;i<=Valor;i++)
            {
                System.out.println(i);
            }
        }
    }
}
