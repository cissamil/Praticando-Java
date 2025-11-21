package banco;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double valorUsadoCheque;

    public ContaBancaria(double depositoInicial){
        //construtor que inicializa a conta com saldo inicial, cheque e zera valorUsadoCheque
        this.saldo = depositoInicial;

        if(depositoInicial <= 500){
            this.chequeEspecial = 50;
        } else{
            this.chequeEspecial = depositoInicial * 0.5;
        }

        this.valorUsadoCheque = 0;
    
    }


    public void depositar(double valor){
        //valor invalido sai do metodo
        if(valor <= 0){
            System.out.println("Deposito invalido");
            return;
        } 
        //caso 1: usou o cheque 
        if(saldo < 0){
            double faltaQuitar = valorUsadoCheque;

            //e o deposito for menor que a divida
            if(valor < faltaQuitar){
                saldo += valor;
                valorUsadoCheque -= valor;
                return;
            }

        saldo += valor;
        saldo -= faltaQuitar;
        valorUsadoCheque = 0;
        cobrarTaxa();
            
        return;

        }
        //caso 2: saldo positivo + deposito
        saldo += valor;

    }

    public boolean sacar(double valor){

        if(valor <= 0){
            System.out.println("Erro, saque um valor valido!");
            return false;
        }

        //verificar o total = saldo + cheque - valor usado cheque
        double capacidadeTotal = saldo + (chequeEspecial - valorUsadoCheque);

        if (valor > capacidadeTotal){
            System.out.println("saldo inuficiente mesmo com cheque!");
            return false;
        }
        //caso 1: saldo positivo
        if(saldo > 0){
            saldo -= valor;
            System.out.println("Sucesso");
            return true;
        }

        //caso 2: saldo negativo, usar o cheque disponivel
        double falta = valor - saldo;
        saldo =- falta;
        valorUsadoCheque += falta;
        System.out.println("Sucesso!");
        return true;
        } 


    public boolean pagarBoleto(double valor){
        return sacar(valor);
    }

     public double consultarSaldo(){
        return saldo;
    }

    public double consultarCheque(){
        return chequeEspecial;
    }

    public boolean usouCheque(){
        return valorUsadoCheque > 0;
    }

    private void cobrarTaxa(){
        double taxa = valorUsadoCheque * 0.20;
        saldo -= taxa;
        valorUsadoCheque = 0;
        System.out.printf("Taxa de cheque especial cobrada: %.2f", taxa);

    }
}
