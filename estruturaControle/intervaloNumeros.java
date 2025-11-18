package estruturaControle;
import java.util.Scanner;

public class intervaloNumeros {
    public static void main(String args[]){
        var scanner = new Scanner(System.in);
    
        System.out.printf("Escolha um intervalo de numeros, digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.printf("Digite o ultimo numero: ");
        int num2 = scanner.nextInt();
        System.out.printf("Digite 0 para Par e 1 para Impar:");
        int tipo = scanner.nextInt();
        System.out.printf("Intervalo de numeros de %d a %d sera:\n", num1,num2);
        scanner.close();

        if(num1>num2 || (tipo != 0 && tipo != 1)){
            System.out.print("Erro reveja suas respostas!");
            return;
            
        }
       
            for(int i = num2; i >= num1; i--){

                if(tipo == 0 && i % 2 == 0){
                System.out.println(i);
                } else if( tipo == 1 && i % 2 != 0){
                    System.out.println(i);
                }
            }

            
    }
}
