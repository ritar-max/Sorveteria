import java.util.Scanner;

public class Sorveteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int quantidadeBolas = 0;
        
        do {
            System.out.println("===== SORVETERIA =====");
            System.out.println("1 - Chocolate");
            System.out.println("2 - Morango");
            System.out.println("3 - Baunilha");
            System.out.println("4 - Flocos");
            System.out.println();
            System.out.println("0 - Fechar pedido");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    quantidadeBolas++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println();

        } while (opcao != 0);

        if (quantidadeBolas == 0) {
            System.out.println("Obrigado pela preferência!");
        } else {
            double valorSemDesconto = quantidadeBolas * 3.00;
            double desconto = 0.0;

            if (quantidadeBolas >= 3) {
                desconto = valorSemDesconto * 0.15;
            }

            double valorFinal = valorSemDesconto - desconto;

            System.out.println("Quantidade de bolas: " + quantidadeBolas);
            System.out.printf("Valor sem desconto: R$ %.2f\n", valorSemDesconto);

            if (desconto > 0) {
                System.out.printf("Desconto (15%%): R$ %.2f\n", desconto);
            }

            System.out.printf("Valor final: R$ %.2f\n", valorFinal);
            System.out.println("Obrigado pela preferência!");
        }

        scanner.close();
    }
}