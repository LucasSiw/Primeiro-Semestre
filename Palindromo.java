//Escreva um programa em Java que receba uma string como entrada e determine se ela é um palíndromo ou não. Um palíndromo é uma palavra, frase ou sequência de caracteres que é igual quando lida da esquerda para a direita e da direita para a esquerda.
//Por exemplo, "arara" é um palíndromo, mas "casa" não é.
//Seu programa deve imprimir "Sim" se a entrada for um palíndromo e "Não" caso contrário.
//Para simplificar o problema, vamos considerar que a entrada não possui espaços em branco e é composta apenas por caracteres minúsculos.
//Por exemplo, se a entrada for "arara", a saída do programa deve ser:
//Sim
//E se a entrada for "casa", a saída do programa deve ser:
//Não
//Boa sorte e divirta-se!
package Teste;

import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        if (ehPalindromo(palavra)) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

    public static boolean ehPalindromo(String palavra) {
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

