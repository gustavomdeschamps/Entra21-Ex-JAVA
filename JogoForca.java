import java.util.Scanner;

public class JogoForca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      JOGO DA FORCA - Aula 03");
        System.out.println("====================================\n");

        // ================= VARIÁVEIS DO JOGO =================
        String palavraSecreta = "LUA";        // Palavra a ser adivinhada
        int tentativasRestantes = 6;
        int letrasAcertadas = 0;
        String letrasDescobertas = "_ _ _";   // Representação visual da palavra

        System.out.println("Tema: Espaço / Exploração");
        System.out.println("Adivinhe a palavra secreta!");
        System.out.println("Dica: É o lugar onde nosso astronauta está explorando.\n");

        // Loop simples do jogo
        while (tentativasRestantes > 0 && letrasAcertadas < 3) {

            System.out.println("Palavra: " + letrasDescobertas);

            System.out.println("Tentativas restantes: " + tentativasRestantes);

            System.out.print("\nDigite uma letra: ");
            String letra = scanner.nextLine().toUpperCase();

            // Verifica se a letra está na palavra
            if (letra.length() == 1) {
                char letraDigitada = letra.charAt(0);

                if (palavraSecreta.contains(letra)) {
                    System.out.println("☑ Acertou! A letra '" + letra + "' está na palavra.");

                    // Atualiza a palavra descoberta (versão simplificada para iniciantes)
                    if (letraDigitada == 'L') letrasDescobertas = "L _ _";
                    else if (letraDigitada == 'U') letrasDescobertas = "_ U _";
                    else if (letraDigitada == 'A') letrasDescobertas = "_ _ A";

                    letrasAcertadas++;

                } else {
                    System.out.println("❌ Errou! A letra '" + letra + "' não está na palavra.");
                    tentativasRestantes--;
                }

            } else {
                System.out.println("Por favor, digite apenas uma letra.");
            }

            System.out.println("------------------------------------");
        }

        // ================= RESULTADO FINAL =================
        System.out.println("====================================");
        if (letrasAcertadas == 3) {
            System.out.println("🎉 PARABÉNS! Você acertou a palavra: " + palavraSecreta);
            System.out.println("O astronauta sobreviveu mais uma missão!");
        } else {
            System.out.println("💀 Game Over! A palavra era: " + palavraSecreta);
            System.out.println("O oxigênio acabou...");
        }
        System.out.println("====================================");

        scanner.close();
    }
}