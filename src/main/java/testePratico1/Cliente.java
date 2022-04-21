package testePratico1;

public class Cliente {
    private String nome_cliente;
    private Telefone telefone;
    private Conta conta;


    public Cliente(String nome_cliente, Telefone telefone, Conta conta){
        this.nome_cliente=nome_cliente;
        this.telefone=telefone;
        this.conta=conta;
    }
    public String getNome() {
        return this.nome_cliente;
    }
    public void setNome(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public Telefone getTelefone() {
        return this.telefone;
    }
    public void setTelefoneCliente(Telefone telefone) {
        this.telefone = telefone;
    }

    public Conta getConta() {
        return this.conta;
    }
    public void setContaCliente(Conta conta) {
        this.conta = conta;
    }
}
