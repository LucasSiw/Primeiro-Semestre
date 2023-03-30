package ListaSe;

import javax.swing.*;

public class Atividade5 {
    public static void main(String[] args) {

        double n1, n2, media;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
        media = (n1+n2)/2;

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Media do aluno é: "+media+
                    "\nAluno Aprovado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Media do aluno é: "+media+
                    "\nAluno Reprovado");
        }
    }
}
