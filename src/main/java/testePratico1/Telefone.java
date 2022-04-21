package testePratico1;

public class Telefone {
    private static String numero_linha;
    private static int saldoTelefone;


    public Telefone(String numero_linha, int saldo){
        Telefone.numero_linha = numero_linha;
        Telefone.saldoTelefone =saldo;
    }

    public String getNumeroLinha() {
        return numero_linha;
    }
    public void setNumeroLinha(String numero_linha) {
        Telefone.numero_linha = numero_linha;
    }

    public int getSaldoTelefone() {
        return saldoTelefone;
    }
    public void setSaldoTelefone(int saldo) {
        Telefone.saldoTelefone = saldo;
    }
}
