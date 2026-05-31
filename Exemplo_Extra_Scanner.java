import java.util.Scanner;

public class Exemplo_Extra_Scanner {
    public static void main(String[] args) {

        Scanner nomeSc = new Scanner(System.in);
        System.out.println("Digite seu nome aqui:");
        String nome = nomeSc.nextLine();


        Scanner enderecoSc = new Scanner(System.in);
        System.out.println("Digite seu endereço aqui:");
        String endereco = enderecoSc.nextLine();


        Scanner idadeSc = new Scanner(System.in);
        System.out.println("Digite sua idade aqui:");
        byte idade = idadeSc.nextByte();

        System.out.println("\nMeu nome é:");
        System.out.println(nome);

        System.out.println("\nMeu endereço é:");
        System.out.println(endereco);

        System.out.println("\nMinha idade é:");
        System.out.println(idade);

    }

}
