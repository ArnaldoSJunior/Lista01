/*1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número menor ou igual a 10!”, caso este número seja menor ou igual */
import java.util.Scanner;
public class Exercicio01 {

    public static void executar(){
    
      int num;

      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite um número: ");
      num = leitor.nextInt();

      if(num > 10){
         System.out.println("Número maior que 10!");
        }else{
        System.out.println("Número menor que 10!");
        }

      leitor.close();
}

}
