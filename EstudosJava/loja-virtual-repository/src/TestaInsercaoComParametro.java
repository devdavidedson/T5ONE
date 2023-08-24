import java.sql.*;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {

        String nome = "MONITOR";
        String descricao = "MONITOR 21'";

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
                Statement.RETURN_GENERATED_KEYS);

        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()) {
            Integer id = rst.getInt(1);
            System.out.println("O ID GERADO FOI: " + id);
        }

    }

}
