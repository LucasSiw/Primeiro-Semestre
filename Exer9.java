package Lista3;

import javax.swing.*;

public class Exer9 {
    public static void main(String[] args) {

        int[] Valor = new int[10];
        int Intervalo = 0, frIntervalo = 0;

        for (int i=0;i<10;i++)
        {
            Valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
            if(Valor[i] >= 10 && Valor[i] <= 20)
            {
                Intervalo++;
            }
            else {
                frIntervalo++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade dentro do Intervalo de 10 a 20: "+Intervalo
        +"\nQuantidade Fora do Intervalo: "+frIntervalo);
    }
}
