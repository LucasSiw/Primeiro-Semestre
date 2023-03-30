package Lista1;

import javax.swing.*;

public class Atividade9 {
    public static void main(String[] args) {

        float Nota1, Nota2, Nota3, Media = 0;

        Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 1°: "));
        Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 2°: "));
        Nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 3°: "));

        Media = ((Nota1*2)+(Nota2*3)+(Nota3*5))/10;

        JOptionPane.showMessageDialog(null, "A media final do Aluno é: "+Media);
    }
}
