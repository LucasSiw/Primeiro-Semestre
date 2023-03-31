package Teste;

import javax.swing.*;

public class Desafio3 {
    public static void main(String[] args) {

        int Valor = 0, Soma = 0;
        int qtdValores = 0, Controle = 0;
        float Media = 0;
        String Mensagem = ",";

        qtdValores = Integer.parseInt(JOptionPane.showInputDialog("Informe a quatidade que deseja digitar: "));
        Controle = qtdValores;

        while (Controle > 0) {
            Valor = Integer.parseInt(JOptionPane.showInputDialog("Informe os Valores: "));
            Soma = Soma+Valor;
            Controle--;
        }
        Media = Soma/qtdValores;

        JOptionPane.showMessageDialog(null, "A Média dos valores é: "+Media);
    }
}
