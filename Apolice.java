package Teste;

import javax.swing.*;

public class Apolice {
    private String nomeSegurado;
    private int idadeSegurado;
    private float valorPremio;
    int Cidade;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void Imprimir()
    {
        JOptionPane.showMessageDialog(null, "Nome do Segurado: "+getNomeSegurado()
                +"\nIdade do Segurado: "+getIdadeSegurado()
                +"\nValor Prêmio: "+getValorPremio());
    }

    public float calcularPremioApolice()
    {
        if (getIdadeSegurado() >= 18 && getIdadeSegurado() <= 25)
        {
            this.valorPremio+= (this.valorPremio*20)/100;
        } else if (getIdadeSegurado() >= 25 && getIdadeSegurado() <= 26) {
            this.valorPremio+= (this.valorPremio*15)/100;
        }
        else if (getIdadeSegurado() > 36) {
            this.valorPremio+= (this.valorPremio*10)/100;
        }
        return valorPremio;
    }

    public void oferecerDesconto()
    {
        this.Cidade = Integer.parseInt(JOptionPane.showInputDialog("Qual dessas cidades você deseja receber desconto: "+
                "\n1- Blumenau" +
                "\n2- Rio do Cedros" +
                "\n3- Florioanópilos" +
                "\n4- Joinville"));
    }

    public void Calculo()
    {
        switch (this.Cidade)
        {
            case 1-> {
                this.valorPremio = (this.valorPremio*20)/100;
                JOptionPane.showMessageDialog(null, "Desconto de 20%, valor final de: "+this.valorPremio);
            }
            case 2-> {
                this.valorPremio = (this.valorPremio*15)/100;
                JOptionPane.showMessageDialog(null, "Desconto de 15%, valor final de: "+this.valorPremio);
            }
            case 3-> {
                this.valorPremio = (this.valorPremio*10)/100;
                JOptionPane.showMessageDialog(null, "Desconto de 10%, valor final de: "+this.valorPremio);
            }
            case 4-> {
                this.valorPremio = (this.valorPremio*5)/100;
                JOptionPane.showMessageDialog(null, "Desconto de 5%, valor final de: "+this.valorPremio);
            }

        }
    }
}

