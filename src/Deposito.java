import java.util.Scanner;

public class Deposito {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            /*TODO: Imprimir a mensagem de sucesso, formatando o saldo atual
             (vide Exemplos).*/
            System.out.printf("Deposito realizado com sucesso!%nSaldo atual: R$ %.2f%n", valor);

        } else if (valor < 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.println("Encerrando o programa...");
        }
    }
}
