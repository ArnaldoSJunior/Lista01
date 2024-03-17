/*Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo o usuário também deverá ser informado. */
public class Exercicio07 {
    public static void executar(){
    System.out.println("Digite um número: ");
    int num = Prompt.lerInteiro();
    
    if(num >= 100 &&  num <= 200){
        System.out.println("Seu número está entre 100 e 200");
      }else{
        System.out.println("Seu número não está entre 100 e 200");
      }
      
  
}

}
