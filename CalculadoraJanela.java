package Teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJanela extends JFrame implements ActionListener {
    private JTextField campoTexto;

    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JButton btnMais, btnMenos, btnMultiplicar, btnDividir, btnIgual, btnPonto, btnLimpar;

    private double num1 = 0.0, num2 = 0.0, resultado = 0.0;
    private char operador = ' ';

    public CalculadoraJanela() {
        setTitle("Calculadora");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        campoTexto = new JTextField();
        campoTexto.setEditable(false);

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        btnMais = new JButton("+");
        btnMenos = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnIgual = new JButton("=");
        btnPonto = new JButton(".");
        btnLimpar = new JButton("C");

        JPanel painelNumeros = new JPanel();
        painelNumeros.setLayout(new GridLayout(4, 3));
        painelNumeros.add(btn1);
        painelNumeros.add(btn2);
        painelNumeros.add(btn3);
        painelNumeros.add(btn4);
        painelNumeros.add(btn5);
        painelNumeros.add(btn6);
        painelNumeros.add(btn7);
        painelNumeros.add(btn8);
        painelNumeros.add(btn9);
        painelNumeros.add(btnPonto);
        painelNumeros.add(btn0);
        painelNumeros.add(btnLimpar);

        JPanel painelOperacoes = new JPanel();
        painelOperacoes.setLayout(new GridLayout(5, 1));
        painelOperacoes.add(btnMais);
        painelOperacoes.add(btnMenos);
        painelOperacoes.add(btnMultiplicar);
        painelOperacoes.add(btnDividir);
        painelOperacoes.add(btnIgual);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.add(campoTexto, BorderLayout.NORTH);
        painel.add(painelNumeros, BorderLayout.CENTER);
        painel.add(painelOperacoes, BorderLayout.EAST);

        add(painel);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        btnMais.addActionListener(this);
        btnMenos.addActionListener(this);
        btnMultiplicar.addActionListener(this);
        btnDividir.addActionListener(this);
        btnIgual.addActionListener(this);
        btnPonto.addActionListener(this);
        btnLimpar.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}