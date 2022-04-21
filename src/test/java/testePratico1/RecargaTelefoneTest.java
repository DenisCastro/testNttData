package testePratico1;

import org.junit.Before;
import org.junit.Test;

public class RecargaTelefoneTest {

    RecargaTelefone recargaTelefone = new RecargaTelefone();

    @Test
    public void testSucessoRecarga(){
        recargaTelefone.setConta(100, 20);
        recargaTelefone.setTelefone("19993195234", 0);
        recargaTelefone.setCliente("Denis Castro");
        recargaTelefone.realizarRecargaTelefone();
    }

    @Test
    public void testSaldoInsuficienteParaRecarga(){
        recargaTelefone.setConta(100, 200);
        recargaTelefone.setTelefone("19993195234", 0);
        recargaTelefone.setCliente("Denis Castro");
        recargaTelefone.realizarRecargaTelefone();
    }

    @Test
    public void testFalhaNaoTratada(){
        //TODO: A fim de simular alguma falha não tratada no fluxo de recarga de celular, descomente a linha que contém: throw new NullPointerException(); na classe RecargaTelefone
        recargaTelefone.setConta(100, 20);
        recargaTelefone.setTelefone("19993195234", 0);
        recargaTelefone.setCliente("Denis Castro");
        recargaTelefone.realizarRecargaTelefone();
    }
}
