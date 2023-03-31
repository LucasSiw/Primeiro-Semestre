package Lista3;

import javax.swing.*;

public class Exer10 {
    public static void main(String[] args) {

    int[] Valor = new int[10];
    int Soma=0;
    float Media=0;
    for (int i=0;i<10;i++) {
        Valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        Soma= Valor[i]+Soma;
        }
    Media = Soma/10;
    JOptionPane.showMessageDialog(null, "A media dos números é: "+Media);
    }
}
