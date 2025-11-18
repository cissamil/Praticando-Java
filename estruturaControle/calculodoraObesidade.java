 // calculo do seu IMC

package estruturaControle;
import java.util.Scanner;

public class calculodoraObesidade {

  public static void main(String args[]){
        var scanner = new Scanner(System.in);
        System.out.printf("qual a sua altura (cm)? ");
        int h = scanner.nextInt();
        System.out.printf("Qual seu peso? ");
        double p = scanner.nextFloat();
        double IMC = p /(h * h);
        
        if(IMC <= 18.5){
                System.out.printf("Abaixo do peso");
        }else if(18.6 >= IMC && IMC <= 24.9 ){
                System.out.printf("Peso ideal");

        }else if(25 >= IMC && IMC <= 29.9 ){
                System.out.printf("Levemente acima do peso");
        }else if(30 >= IMC && IMC <= 34.9 ){
                System.out.printf("Obesidade Grau I");
        }else if(35 >= IMC && IMC <= 39.9 ){
                System.out.printf("Obesidade Grau II (Severa)");
        }else {
                System.out.printf("Obesidade III (Mórbida)");
        }

        scanner.close();
    
 }
}
