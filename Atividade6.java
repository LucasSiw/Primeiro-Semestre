package ListaSe;

import javax.swing.*;

public class Atividade6 {
    public static void main(String[] args) {

        int anoAtual, idade, anoNasceu = 0;

        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você esta atualmente: "));
        anoNasceu = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
        idade = anoAtual - anoNasceu;

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Voto obrigatorio");
        } else {
            if (idade >= 16) {
                JOptionPane.showMessageDialog(null, "Voto opcional");
            } else {
                JOptionPane.showMessageDialog(null, "Você não pode votar");
            }
        }
    }
}
