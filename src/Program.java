import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, entrada, valorTotal, valorPrestacoes;
		int prestacoes;

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();

		do {
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			if (salario < 0) {
				System.out.println("O salario nao pode ser negativo. Tente novamente.");
			}
		} while (salario < 0);

		System.out.print("Numero de prestacoes: ");
		prestacoes = sc.nextInt();

		System.out.print("Porcentagem de entrada: ");
		entrada = sc.nextDouble();

		do {
			System.out.print("Valor total financiado: ");
			valorTotal = sc.nextDouble();

			valorPrestacoes = (valorTotal - (valorTotal * entrada) / 100) / prestacoes;

			if (valorPrestacoes > salario * 0.3) {
				System.out.println("Capacidade de pagamento excedida. Tente novamente.");
			}

		} while (valorPrestacoes > salario * 0.3);
	}

}
