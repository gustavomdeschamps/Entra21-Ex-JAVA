import java.util.Scanner;

public class NeoMatrix {
    public static void main(String[] args) {
        System.out.println("Hello NEO, wake up");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui seu número favorito:");
        int numFAV = scanner.nextInt();

        System.out.println("Digite outro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();

        int soma = num1 + num2 + numFAV;
        int subtracao = num1 - num2 - numFAV;
        int divisao = num1 / num2 / numFAV;
        int multiplicacao = num1 * num2 * numFAV;

        System.out.println("Parabens NEO, você informou o CODEX.");
        System.out.println("A Soma do CODEX será o número inicial da soma, digite 1 da senha:" + soma);
        System.out.println("A subtração será o número seguinte da soma do CODEX, digite 2 da senha:" + subtracao);
        System.out.println("A divisão será o número seguinte da senha do CODEX , digite 3 da senha:" + divisao);
        System.out.println("A multiplicação será o número seguinte da senha do CODEX, digite 4 da senha:" + multiplicacao);
    }
}
