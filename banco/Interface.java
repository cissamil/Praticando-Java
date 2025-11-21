package banco;
import java.util.Scanner;
public class Interface {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.printf("Bem vindo(a) ao Banco do Yellow Musk, digite o valor do deposito inicial: ");
        double valorDigitado = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(valorDigitado);
    
        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    //consultar saldo
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.consultarSaldo());
                    break;
                    
                case 2:
                    //consultar cheque
                    System.out.printf("Limite do cheque especial: R$ %.2f\n", conta.consultarCheque());
                    break;

                case 3:
                    // depositar
                    System.out.println("Digite um valor de deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    //sacar
                    System.out.print("Digite um valor de saque: ");
                    double valorSaque = scanner.nextDouble();

                    boolean sucesso = conta.sacar(valorSaque);

                    if(sucesso){
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Falha ao realizar o saque.");
                    }

                    break;

                case 5:
                    // pagar boleto
                    System.out.print("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();

                    boolean sucessoPago = conta.pagarBoleto(valorBoleto);

                    if(sucessoPago){
                        System.out.println("Boleto pago!");
                    } else {
                        System.out.println("Nao foi possivel pagar o boleto!");
                    }

                    break;

                case 6:
                    // usou cheque?
                    boolean chequeUsado = conta.usouCheque();

                    if(chequeUsado){
                        System.out.println("Foi usado!");
                    } else {
                        System.out.println("Nao foi usado!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}