import factory.ConnectionFactory;

import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        //primeiro estabelecemos conexão com o Banco
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperaConexao();

        //depois fazemos um Statement para usar comandos no banco
        PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        stm.execute();

        //pegamos o resultado e lançamos no laço "While"
        ResultSet rsl = stm.getResultSet();

        while (rsl.next()){
            Integer id = rsl.getInt("ID");
            System.out.println(id);
            String nome = rsl.getString("NOME");
            System.out.println(nome);
            String descricao = rsl.getString("DESCRICAO");
            System.out.println(descricao);
        }

        con.close();

    }
}
