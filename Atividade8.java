package Lista1;

import javax.swing.*;

public class Atividade8 {
    public static void main(String[] args) {

        float Fah, Celcius = 0;

        Fah = Float.parseFloat(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit: "));
        Celcius = (Fah-32)*5/9;

        JOptionPane.showMessageDialog(null, "A temperatura em Celcius é: "+Celcius+ " °C");
    }
}
