package ListaSe;

import javax.swing.*;

public class Atividade8 {
    public static void main(String[] args) {

        float n1, n2;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeiro número: "));
        n2  = Float.parseFloat(JOptionPane.showInputDialog("Digite segundo número: "));
        if(n1 > n2) {
            JOptionPane.showMessageDialog(null, n1+" "+n2);
        }
        else {
            JOptionPane.showMessageDialog(null, n2+"  "+n1);
        }
    }
}
