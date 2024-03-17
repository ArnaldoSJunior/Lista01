/*Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra variável do tipo CARACTERE. Imprima o resultado da operação de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma mensagem de operador não definido. Tratar erro de divisão por zero. */
import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        String entrada = leitor.next();
        char op = entrada.charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return; 
                break;
            default:
                System.out.println("Operador inválido!");
                return;
        }

        System.out.println("Resultado: " + resultado);

        leitor.close();
    }
}
