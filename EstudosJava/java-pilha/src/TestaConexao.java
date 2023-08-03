public class TestaConexao {

    public static void main(String[] args) {


       try(Conexao con = new Conexao()) {
            con.leDados();
       } catch (IllegalStateException ex) {
           System.out.println("Deu erro de conexão");
       }


        //Essa era a forma usada no metódo legado
        /*Conexao con = null;

        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro de conexão");
        } finally {
            if(con != null) {
                con.fecha();
            }
        }*/
    }
}
