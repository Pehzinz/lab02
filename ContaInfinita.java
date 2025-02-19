public class ContaInfinita extends Conta{
    public ContaInfinita(int n, double v){
        super(n, v);
    }

    @Override
    public void depositar(double valor){
        saldo+= valor + 5;
    }

    @Override
    public boolean sacar(double valor){
        saldo -= valor;
        return true;
    }

}