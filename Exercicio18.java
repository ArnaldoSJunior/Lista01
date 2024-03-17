/*Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica.Média harmônica =31 + 1 + 1nota1 nota2 nota3Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8Média: 7.37 */
public class Exercicio18 {
  public static void executar(){

    System.out.println("Informe as notas: ");

    System.out.println("Nota 1: ");
    double nota1 = Prompt.lerDecimal();

    System.out.println("Nota 2: ");
    double nota2 = Prompt.lerDecimal();
    
    System.out.println("Nota 3: ");
    double nota3 = Prompt.lerDecimal();
    
    double mediah = 3 / ((1/nota1) +(1/nota2) + (1/nota3));

    System.out.println("A média harmônica é: " + mediah);


  }

}
