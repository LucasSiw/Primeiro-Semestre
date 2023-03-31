package Teste;

import java.util.Scanner;
import java.lang.Math;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        double num1, num2, resultado;
        char operador;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /, ^, r): ");
        operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado é: " + resultado);
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                System.out.println("O resultado é: " + resultado);
                break;
            case 'r':
                resultado = Math.sqrt(num1);
                System.out.println("A raiz quadrada de " + num1 + " é " + resultado);
                resultado = Math.cbrt(num1);
                System.out.println("A raiz cúbica de " + num1 + " é " + resultado);
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                break;
        }

        sc.close();
    }
}
