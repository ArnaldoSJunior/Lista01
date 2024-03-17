/*Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seuvolume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura;Exemplo: raio = 10, altura = 15. Volume = 4710 */
public class Exercicio19 {
    public static void executar(){

    System.out.println("Digite o raio: ");
    double raio = Prompt.lerDecimal();
    System.out.println("Digite a altura: ");
    double altura = Prompt.lerDecimal();

    double volume = 3.14 * Math.pow(raio,2)*altura;

    System.out.println("O volume é:" + volume);


    }
    
}
