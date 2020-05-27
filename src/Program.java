import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double salario;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
	
		do {
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			if(salario < 0) {
				System.out.println("O salario nao pode ser negativo. Tente novamente.");
			}
		}while(salario < 0);
		
	}

}
