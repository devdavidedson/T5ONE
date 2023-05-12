import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sorteio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroUsuario = 0;


        while (tentativas < 5) {
            System.out.println("Digite um número de 1 a 100!");
            numeroUsuario = scanner.nextInt();
            tentativas += 1;

            if (numeroUsuario == sorteio) {
                System.out.println("Parabéns você acertou");
                break;
            } else if (numeroUsuario > sorteio) {
                System.out.println("O Número informado é MAIOR que o número sorteado!");
            } else {
                System.out.println("O Número informado é MENOR que o número sorteado!");
            }

            if (tentativas == 5) {
                System.out.println("Você não acertou!");
            }
        }

        System.out.println("O Número sorteado foi " + sorteio);
    }
}
