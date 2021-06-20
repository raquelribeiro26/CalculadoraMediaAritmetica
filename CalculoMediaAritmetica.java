
package calculomediaaritmetica;

import java.util.Scanner;


public class CalculoMediaAritmetica {

   
    public static void main(String[] args) {
    double nota1,nota2,nota3,media;
    
    Scanner entrada = new Scanner(System.in);
        
    System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextDouble();
    
    System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();
        
    System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextDouble();
        
    
     media  = (nota1 + nota2 + nota3) /3;
     
        System.out.println("A média do aluno é: " +media);
     
        
     if (media>70){
         System.out.println("Aluno Aprovado!");
     } else if (media>50){
         System.out.println("Aluno em Recuperação");
    }else {
         System.out.println("Aluno Reprovado");
     }
}
}