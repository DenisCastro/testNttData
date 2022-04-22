package testePratico3.stepdefs;

import cucumber.api.java.en.Given;
import intern.CoreWeb;

import java.sql.*;

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
    public void oUsuárioRealizaAConsultaNoBancoDeDadosPeloAparelhoEmOferta() {
        String url = "jdbc:mysql://localhost:3306/banco_teste_automacao";
        String userName = "root";
        String password = "123456";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String sql = "SELECT * FROM MASSAS";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                dbIdMassas = result.getString("IDMASSAS");
                dbNameProduct = result.getString("NAME_PRODUCT");
                dbCustomization = result.getString("CUSTOMIZATION");
                dbDisplay = result.getString("DISPLAY");
                dbDisplayResolution = result.getString("DISPLAY_RESOLUTION");
                dbDisplaySize = result.getString("DISPLAY_SIZE");
                dbMemory = result.getString("MEMORY");
                dbOperatingSystem = result.getString("OPERATING_SYSTEM");
                dbProcessor = result.getString("PROCESSOR");
                dbTouchscreen = result.getString("TOUCHSCREEN");
                dbWeight = result.getString("WEIGHT");
                dbColor = result.getString("COLOR");
                System.out.println("variavel dbColor: " + dbColor);
                count++;
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
