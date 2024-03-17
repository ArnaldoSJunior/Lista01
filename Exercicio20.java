/*Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média da viagem. */
public class Exercicio20 {
    public static void executar(){

    System.out.println("Digite o tempo (hora) da viagem:");
    double hora = Prompt.lerDecimal();

    System.out.println("Digite a velocidade média:");
    double velmed = Prompt.lerDecimal();

    double km = velmed * hora;
    double litros = km/12;


    System.out.println("Total de litros gastos: " + litros);

    }
}
