import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        CriaConexao connectionFactory = new CriaConexao();
        Connection con = connectionFactory.recuperaConexao();

        Statement stm = con.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

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
