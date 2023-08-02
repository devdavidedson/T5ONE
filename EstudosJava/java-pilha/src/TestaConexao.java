public class TestaConexao {

    public static void main(String[] args) {
        Conexao con = null;

        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalAccessError ex) {
            System.out.println("Deu erro de conexão");
        } finally {
            con.fecha();
        }
    }
}
