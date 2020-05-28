import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, entrada, valorTotal, valorPrestacoes;
		int prestacoes, opcao;

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
		
		System.out.println();
		
		do {
			System.out.println("MENU:");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar o valor de cada prestacao");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = sc.nextInt();
			System.out.println();
			
			switch(opcao) {
				case 1:
					System.out.printf("ENTRADA = R$ %.2f\n\n", valorTotal * entrada / 100);
					break; 
				case 2: 
					System.out.printf("VALOR FINANCIADO = R$ %.2f\n\n", (valorTotal - (valorTotal * entrada) / 100));
					break; 
				case 3: 
					System.out.printf("VALOR DE CADA PRESTACAO = R$ %.2f\n\n", valorPrestacoes);
					break;
				case 4:
					System.out.println("FIM DO PROGRAMA!");
					break;
				default:
					System.out.println("Valor inválido. tente novamente.\n");
			}
		}while(opcao != 4);
		
		
	}

}
