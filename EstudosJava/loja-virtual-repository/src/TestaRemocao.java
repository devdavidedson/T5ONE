import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
        stm.setInt(1, 2);

        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println("Foram apagadas " + linhasModificadas + " linhas da tabela.");

        connection.close();
    }
}
