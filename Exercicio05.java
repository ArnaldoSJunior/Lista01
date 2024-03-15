
/*Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B e o valor da variável B passe a ser ovalor da variável A. Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados. */
import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para variável A: ");
        int a = leitor.nextInt();

        System.out.println("Digite um número para variável B: ");
        int b = leitor.nextInt();

        System.out.println("variável A: " + a);
        System.out.println("variável B: " + b);

        int aux = a;
        a = b;
        b = aux;
        System.out.println("Após a troca");
        System.out.println("variável A recebeu b: " + a);
        System.out.println("variável B recebeu a: " + b);

        leitor.close();
    }

}
