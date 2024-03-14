/*Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida. */

import java.util.Scanner;
public class Exercicio03 {
    public static void executar(){

    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = leitor.nextInt();
        

        if(a > b){
            System.out.println("O primeiro número é o maior: " + a );
        }else if(a < b){
            System.out.println("O segundo número é o maior: " + b );
        }
        else{
            System.out.println("sequência de números informados é inválida");
        }
        
    
    
    leitor.close();
    }
  
}
