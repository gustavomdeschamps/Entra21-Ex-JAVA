// Bora fazer os cálculos da conta do mês

public class ContaMes {
    public static void main(String[] args) {

        int aluguel1 = 3000;
        int energia = 200;
        int agua = 400;
        int alimento = 1800;
        int passeio = 250;
        int educacao = 1900;
        int carro = 2000;

        int totalmes = aluguel1 + energia + agua + alimento + passeio + educacao + carro;

        System.out.println("Total custos mensal: " + totalmes);
        System.out.println("Total custos semestral: " + totalmes *  6);
        System.out.println("Total custos anual: " + totalmes * 12);
    }
}
