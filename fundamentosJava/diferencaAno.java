//Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
package fundamentosJava;
import java.util.Scanner;
public class diferencaAno{
    public static void main(String args[]){
        var scanner = new Scanner(System.in);
        System.out.printf("Nome da primeira pessoa:");
        String nome1 = scanner.nextLine();
        System.out.printf("Nome da segunda pessoa:");
        String nome2 = scanner.nextLine();
        System.out.printf("Idade da primeira pessoa:");
        int idade1 = scanner.nextInt();
        System.out.printf("Idade primeira pessoa:");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.printf("A difereca de %s e %s das duas idades: %d", nome1,nome2,diferenca);
        scanner.close();
}
    }
    
