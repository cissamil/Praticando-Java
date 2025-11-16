
//Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: 
//"Olá 'Fulano' você tem 'X' anos"

package fundamentosJava;
import java.util.Scanner;
public class nomeAno{
public static void main(String args[]){
    var scanner = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.print("Digite o ano em que voce nasceu: ");
    int dataNasc = scanner.nextInt();
    int idade = 2025 - dataNasc; 
    
    System.out.printf("Ola %s voce tem %d anos\n", nome, idade);
    scanner.close();
}
}