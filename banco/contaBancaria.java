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

    public double consultarSaldo(){
        return saldo;
    }

    public double consultarCheque(){
        return chequeEspecial;
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

        //ou deposito cobre toda a divida
        double usadoAntes = valorUsadoCheque;
        saldo = 0;
        valorUsadoCheque = 0;

        double sobra = valor - faltaQuitar;
        saldo += sobra;
        
        double taxa = usadoAntes * 0.20;
        saldo -= taxa;
            
        return;

        }
        //saldo positivo
        saldo += valor;

    }

    public boolean sacar(double valor){
        return false;
    }

    public boolean pagarBoleto(double valor){
        return false;
    }

    public boolean usouCheque(){
        return valorUsadoCheque > 0;
    }

    private void cobrarTaxa(){

    }
}
