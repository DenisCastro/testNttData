package testePratico1;

import org.junit.Test;

public class RecargaTelefone  {

    Cliente cliente;
    Conta conta;
    Telefone telefone;
    int saldoDaContaAntesDaRecarga;
    int saldoTelefoneAntesDaRecarga;

    protected void setTelefone(String numero_linha, int saldo){
        telefone = new Telefone(numero_linha, saldo);
    }

    protected void setConta(int saldo, int vl_recarga){
        conta = new Conta(saldo);
        conta.setRecarga(vl_recarga);
    }

    protected void setCliente(String nomeCliente){
        cliente = new Cliente(nomeCliente, telefone, conta);
    }

    protected void realizarRecargaTelefone(){
        saldoDaContaAntesDaRecarga = conta.getSaldo();
        saldoTelefoneAntesDaRecarga = telefone.getSaldoTelefone();
        if (conta.getRecarga() <= conta.getSaldo()){
            System.out.println("====INICIO FLUXO RECARGA====");
            try {
                System.out.println("Saldo conta antes da recarga: " + conta.getSaldo());
                conta.setSaldo(conta.getSaldo() - conta.getRecarga()) ;
                System.out.println("Saldo conta depois da recarga: " + conta.getSaldo());

                System.out.println("saldo telefone antes da recarga: " + telefone.getSaldoTelefone());
                telefone.setSaldoTelefone(telefone.getSaldoTelefone() + conta.getRecarga());
                System.out.println("saldo telefone depois da recarga: " + telefone.getSaldoTelefone());
                System.out.println("====FIM FLUXO RECARGA====");
                throw new NullPointerException();
            } catch (Exception e){
                System.out.println("====INICIO FLUXO EXCEÇÃO NÃO TRATADA====");
                System.out.println("Saldo conta antes da falha da recarga: " + conta.getSaldo());
                telefone.setSaldoTelefone(saldoTelefoneAntesDaRecarga);
                conta.setSaldo(conta.getSaldo() + conta.getRecarga());
                System.out.println("Saldo conta depois da falha da recarga: " + conta.getSaldo());
                System.out.println("saldo telefone antes da falha da recarga: " + saldoTelefoneAntesDaRecarga);
                System.out.println("saldo telefone depois da falha da recarga: " + telefone.getSaldoTelefone());
                System.out.println("====FIM FLUXO EXCEÇÃO NÃO TRATADA====");
            }
        } else {
            System.out.println("====RECARGA NÃO REALIZADA POR FALTA DE SALDO NA CONTA====");
            System.out.println("saldo da conta antes da tentativa de recarga: " + saldoDaContaAntesDaRecarga);
            System.out.println("saldo telefone antes da tentativa de recarga: " + saldoTelefoneAntesDaRecarga);
            System.out.println("saldo telefone depois da tentativa de recarga: " + telefone.getSaldoTelefone());
            System.out.println("saldo da conta depois da tentativa de recarga: " + conta.getSaldo());
        }
    }

    @Test
    public void testeRecargaTelefone(){
        setConta(100, 20);
        setTelefone("19993195234", 0);
        setCliente("Denis Castro");
        realizarRecargaTelefone();
    }
}
