public abstract class Conta{
    protected double saldo;
    private int numero;

    public Conta (int n, double s){
        this.numero = n;
        this.saldo = s;
    }

    public double consultar(){
        return saldo;
    }

    public abstract void depositar (double valor);
    public abstract boolean sacar (double valor);
    public String toString(){
        return String.format ("[%s, %s]", numero, saldo);
    }
}