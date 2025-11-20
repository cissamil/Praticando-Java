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
