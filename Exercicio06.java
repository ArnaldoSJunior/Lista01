/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5 */

public class Exercicio06 {
    public static void executar(){
        
        System.out.println("Digite a temperatura em graus celsius: ");
        int celsius = Prompt.lerInteiro();

        double fah = (9 * celsius + 160) / 5;
        
        System.out.println("Temperatura em graus fahrenheit: " + fah);


    }
    
}
