/* Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: 
d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03*/
import java.util.Scanner;

public class Exercicio15 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        

        System.out.println("Informe coordenadas de P1");
        System.out.println("Informe x1: ");
        double x1 =  leitor.nextDouble();
        System.out.println("Informe x2: ");
        double y1 =  leitor.nextDouble();

        System.out.println("Informe coordenadas de P2");
        System.out.println("Informe y1: ");
        double  x2 = leitor.nextDouble();
        System.out.println("Informe y2: ");
        double y2 = leitor.nextDouble();

        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        String dFormatado = String.format("%.2f", d);

        System.out.println("A distância é: " + dFormatado);



    leitor.close();
    }
}
