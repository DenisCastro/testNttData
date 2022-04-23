package testePratico3.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import intern.CoreWeb;

import java.sql.*;

import static intern.DBConfig.*;
import static testePratico3.stepdefs.SDAdvantageProducts.newCollorProduct;

public class SDBancoDeDados extends CoreWeb {

    String dbIdMassas = "";
    public static String dbNameProduct = "";
    public static String dbCustomization = "";
    public static String dbDisplay = "";
    public static String dbDisplayResolution = "";
    public static String dbDisplaySize = "";
    public static String dbMemory = "";
    public static String dbOperatingSystem = "";
    public static String dbProcessor = "";
    public static String dbTouchscreen = "";
    public static String dbWeight = "";
    public static String dbColor = "";


    @Given("O usuário realiza a consulta no banco de dados pelo aparelho em oferta")
    public void oUsuárioRealizaAConsultaNoBancoDeDadosPeloAparelhoEmOferta() throws SQLException {
        dbConfig.abrirConexaoBanco();
        String sql = "SELECT * FROM MASSAS";
        resultQuery = statement.executeQuery(sql);
        while (resultQuery.next()) {
            dbIdMassas = resultQuery.getString("IDMASSAS");
            dbNameProduct = resultQuery.getString("NAME_PRODUCT");
            dbCustomization = resultQuery.getString("CUSTOMIZATION");
            dbDisplay = resultQuery.getString("DISPLAY");
            dbDisplayResolution = resultQuery.getString("DISPLAY_RESOLUTION");
            dbDisplaySize = resultQuery.getString("DISPLAY_SIZE");
            dbMemory = resultQuery.getString("MEMORY");
            dbOperatingSystem = resultQuery.getString("OPERATING_SYSTEM");
            dbProcessor = resultQuery.getString("PROCESSOR");
            dbTouchscreen = resultQuery.getString("TOUCHSCREEN");
            dbWeight = resultQuery.getString("WEIGHT");
            dbColor = resultQuery.getString("COLOR");
        }
        dbConfig.fecharConexaoBanco();
    }

    @And("O usuario realiza um update no banco alterando a cor atual do registo para a selecionada no teste")
    public void oUsuarioRealizaUmUpdateNoBancoAlterandoACorAtualDoRegistoParaASelecionadaNoTeste() {
        dbConfig.abrirConexaoBanco();
        String sql = "UPDATE MASSAS a\n" +
                "SET COLOR = '"+newCollorProduct+"'\n" +
                "where a.NAME_PRODUCT = 'HP PAVILION 15Z TOUCH LAPTOP'";
        try {
            resultQueryUpdate = statement.executeUpdate(sql);
        } catch (SQLException e) {
            dbConfig.fecharConexaoBanco();
            throw new RuntimeException(e);
        }
        dbConfig.fecharConexaoBanco();
    }
}
