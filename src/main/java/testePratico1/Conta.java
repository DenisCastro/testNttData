package testePratico1;

public class Conta {
    private int saldoConta;
    protected int vl_recarga;


    public Conta(int saldo){
        this.saldoConta = saldo;
    }
    public int getSaldo() {
        return this.saldoConta;
    }
    public void setSaldo(int saldo) {
        this.saldoConta = saldo;
    }

    public int getRecarga() {
        return this.vl_recarga;
    }
    public void setRecarga(int vl_recarga) {
        this.vl_recarga = vl_recarga;
    }

}
