import java.util.Locale;
import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro valor: ");
            int valor1 = scanner.nextInt();

            System.out.println("Digite o segundo valor: ");
            int valor2 = scanner.nextInt();

            contar(valor1, valor2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro valor não pode ser MAIOR que o segundo valor!");
        }
    }

    static void contar (int valorUm, int valorDois) throws ParametrosInvalidosException {
        if (valorUm > valorDois) {
            throw new ParametrosInvalidosException();

        } else {
            int contagem = valorDois - valorUm;
            for (int i = 0; i < contagem; i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
}
