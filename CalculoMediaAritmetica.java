
package calculomediaaritmetica;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculoMediaAritmetica {

   
    public static void main(String[] args) {
    double nota1,nota2,nota3,media;
    
    Scanner entrada = new Scanner(System.in);
     
        System.out.println("***CALCULADORA DE MEDIA ARITMETICA***\n");
        
    System.out.println("Digite a NOTA 1 (de 0 a 100): ");
        nota1 = entrada.nextDouble();
    
    System.out.println("Digite a NOTA 2 (de 0 a 100): ");
        nota2 = entrada.nextDouble();
        
    System.out.println("Digite a NOTA 3 (de 0 a 100): ");
        nota3 = entrada.nextDouble();
        
    
     media  = (nota1 + nota2 + nota3) /3;
     DecimalFormat f = new DecimalFormat("#.##");
     
        System.out.println("A média do aluno é: " + f.format(media));
     
        
     if (media>70){
         System.out.println("Aluno Aprovado!");
     } else if (media>50){
         System.out.println("Aluno em Recuperação");
    }else {
         System.out.println("Aluno Reprovado");
     }
}
}