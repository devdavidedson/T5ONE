import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int i = 0;

        while (nota != -1) {
            System.out.println("Digite a nota de avalição de 0 a 10 ou -1 para sair");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                i++;
            }
        }

        // Se sair sem colocar nenhum valor ele retorna NaN pq 0 não divide por 0
        System.out.println("A media é" + mediaAvaliacao / i);
    }
}
