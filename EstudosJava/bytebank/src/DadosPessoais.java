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

    private boolean isValidInput(String input) {
        return input.matches("\\d+");
    }

    public void setCpf() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Confirme seu CPF: ");

        String input = scanner.next();

        if (isValidInput(input)) {
            this.cpf = input;
        } else {
            System.out.println("Entrada inválida! Digite apenas números.");
            setCpf();
        }
    }

}
