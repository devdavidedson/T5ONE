import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        CriaConexao criaConexao = new CriaConexao();
        Connection con = criaConexao.recuperaConexao();

        System.out.println("Fechando Conexão!!");

        con.close();
    }
}