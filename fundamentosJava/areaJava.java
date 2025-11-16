//Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela fórmula: área=lado X lado

//        Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela fórmula: área=base X altura

package fundamentosJava;
import java.util.Scanner;
public class areaJava{
    public static void main(String args[]){
        var scanner = new Scanner (System.in);
        System.out.printf("Digite o tamanho do lado do quadrado:");
        double ladoq = scanner.nextFloat();
        double areaq = ladoq * ladoq;
        System.out.printf("A area do quadrado %.2f\n", areaq);

        System.out.printf("Digite a base do retangulo:");
        double baser = scanner.nextFloat();
        System.out.printf("Digite agora a altura do retangulo:");
        double h = scanner.nextFloat();
        double arear = baser * h;
        System.out.printf("A area do seu retangulo: %.2f", arear);
        
        scanner.close();
    }
    
}

