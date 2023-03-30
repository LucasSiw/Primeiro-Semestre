package Lista1;

import javax.swing.*;

public class Atividade6 {
    public static void main(String[] args) {

        float carroNovo, Distribuidor = 12, Imposto = 45, valorFinal = 0, vImposto = 0, vDistribuidor = 0;

        carroNovo = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do Carro Novo: "));
        vImposto = (carroNovo*Imposto)/100;
        vDistribuidor = (vImposto*Distribuidor)/100;
        valorFinal = carroNovo+vImposto+vDistribuidor;

        JOptionPane.showMessageDialog(null, "O valor final pro consumidor será: "+valorFinal);
    }
}
