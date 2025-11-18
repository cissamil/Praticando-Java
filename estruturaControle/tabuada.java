
  // Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
package estruturaControle;
import java.util.Scanner;

public class tabuada{
  public static void main(String args[]){
    var scanner = new Scanner(System.in);
    System.out.printf("Dgite um numero e mostrarei a tabuada dele:");
    int num = scanner.nextInt();
    for(int fator = 0; fator < 11; fator++){
      int tabuada = num * fator;
      System.out.printf("Tabuada do %d: %d\n", num, tabuada);
    }
    
  }
 
}
    
