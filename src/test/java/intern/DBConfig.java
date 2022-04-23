package intern;

import java.sql.*;

public class DBConfig {

    Connection connection;
    public static Statement statement;
    public static ResultSet resultQuery;
    public static int resultQueryUpdate;

    public void abrirConexaoBanco(){
        String url = "jdbc:mysql://localhost:3306/banco_teste_automacao";
        String userName = "root";
        String password = "123456";
        try {
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void fecharConexaoBanco(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void executeQuery(String query){
        try {
            resultQuery = statement.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
