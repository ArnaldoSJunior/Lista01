/*Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaaritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */
public class Exercicio16 {
public static void executar(){
    
    System.out.println("Nota 1: ");
    double nota1 = Prompt.lerDecimal();
    System.out.println("Nota 2: ");
    double nota2 = Prompt.lerDecimal();
    System.out.println("Nota 3: ");
    double nota3 = Prompt.lerDecimal();

    double media = (nota1 + nota2 + nota3) /3;

    System.out.println("Média das notas: " + media);
}
    }
