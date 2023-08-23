import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperaConexao() throws SQLException {
        return DriverManager.getConnection
                ("jdbc:mysql://localhost/loja_virtual?userTimezone=True&serverTimezone=UTC",
                "root",
                "Day010590!");
    }

}
