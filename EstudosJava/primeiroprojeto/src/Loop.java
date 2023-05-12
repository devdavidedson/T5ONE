import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avalição de 0 a 10:");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media final é: " + (mediaAvaliacao / 3));

    }
}
