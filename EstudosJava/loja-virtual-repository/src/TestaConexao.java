import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?userTimezone=True&serverTimezone=UTC",
                        "root",
                        "Day010590!");

        System.out.println("Fechando Conexão!!");

        connection.close();
    }
}