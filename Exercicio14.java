/*A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28 */
public class Exercicio14 {
    public static void executar(){

        System.out.println("Digite a1 (primeiro termo da PA): ");
        int a1 = Prompt.lerInteiro();
        System.out.println("Digite r (razão): ");
        int r = Prompt.lerInteiro();
        System.out.println("Digite n (n-ésimo termo)");
        int n = Prompt.lerInteiro();
        
        int an;

        an = a1 + (n-1) * r;

        System.out.println("Resultado: " + an);
        
        
    }
    
}
