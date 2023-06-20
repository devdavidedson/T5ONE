import java.util.Scanner;

public class DadosPessoais extends ContaDoBanco {
    private String nome;
    private String profissao;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    boolean isValidCpf() {
        String cpfDigitos = cpf.replaceAll("[^0-9]",""); // Remove tudo menos 0-9
        return cpfDigitos.length() == 11;
    }
    public void setCpf() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Confirme seu CPF: ");
        this.cpf = scanner.next();

        if (!isValidCpf()) {
            System.out.println("CPF inválido. Digite 11 caracteres númericos.");
            setCpf();
        }
    }



}
