package Teste;

import javax.swing.*;

public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice Valor = new Apolice();

        Valor.setNomeSegurado(JOptionPane.showInputDialog("Informe o Nome do Segurado: "));
        Valor.setIdadeSegurado(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade do Segurado: ")));
        Valor.setValorPremio(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do premio: ")));
        Valor.Imprimir();
        Valor.calcularPremioApolice();
        Valor.oferecerDesconto();
        Valor.Calculo();
    }
}