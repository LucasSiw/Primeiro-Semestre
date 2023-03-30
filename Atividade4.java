package Lista1;

import javax.swing.*;

public class Atividade4 {
    public static void main(String[] args) {

        int quantEleitores, Voto, vBranco = 0, vNulos = 0, vValidos = 0, Eleitores = 0;
        double porcenBrancos = 0, porcenValidos = 0, porcenNulos = 0;

        quantEleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade dos Eleitores: "));
        Eleitores = quantEleitores;

       while (quantEleitores != 0) {
           Voto = Integer.parseInt(JOptionPane.showInputDialog("Informe utilizando os números abaixo o seu Voto" +
                   "\n1- Valido" +
                   "\n2- Nulo" +
                   "\n3- Branco"));

           switch (Voto)
           {
               case 1 -> {
                   vValidos+=1;
               }
               case 2 ->{
                   vNulos+=1;
               }
               case 3 -> {
                   vBranco+=1;
               }
           }
          quantEleitores = quantEleitores-1;
           }
       porcenValidos = (vValidos*Eleitores)/Eleitores;
       porcenNulos = (vNulos*Eleitores)/Eleitores;
       porcenBrancos = (vBranco*100)/Eleitores;

       JOptionPane.showMessageDialog(null, "O percentual de votos foi: " +
               "\nValidos: "+porcenValidos +
               "\nNulos: "+porcenNulos+
               "\nBrancos: "+porcenBrancos);



    }
}
