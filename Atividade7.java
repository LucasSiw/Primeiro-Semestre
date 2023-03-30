package Lista1;

import javax.swing.*;

public class Atividade7 {
    public static void main(String[] args) {

        double Salario = 0, vtVendas, Comissao = 0, vComissao, sFinal = 0;
        int quatCarros = 0;

        Salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o Salário do Funcionario: "));
        quatCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de Carros vendidos: "));
        vtVendas = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor total das Vendas: "));
        Comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe a comissão por venda: "));

        vComissao = (Comissao*quatCarros);
        vComissao = vComissao + (vtVendas*5/100);
        sFinal = vComissao+Salario;

        JOptionPane.showMessageDialog(null, "O valor final será: "+sFinal);
    }
}
