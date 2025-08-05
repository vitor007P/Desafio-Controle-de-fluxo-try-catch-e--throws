import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lê os dois números inteiros
            System.out.print("Digite o primeiro número: ");
            int parametroUm = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametroDois = scanner.nextInt();

            // Chama o método contador, que pode lançar a exceção
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Trata a exceção com a mensagem customizada
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    // Método responsável por realizar o controle de fluxo
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se os parâmetros são válidos
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidadeInteracoes = parametroDois - parametroUm;

        for (int i = 1; i <= quantidadeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

