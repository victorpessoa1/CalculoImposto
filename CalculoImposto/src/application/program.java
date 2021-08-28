package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class program
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Informe o número de contribuintes: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++)
		{
			System.out.println("Contribuínte #" + i);
			System.out.println("Pessoa Física ou Jurídica (F/J)");
			char c = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (c == 'F')
			{
				System.out.println("Alguma despesa Médica (S/N)? ");
				
				c = sc.next().charAt(0);
				if (c == 'S')
				{
					System.out.println("Informe os gastos médicos: ");
					double gastosSaude = sc.nextDouble();
					list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				}
				else
				{
					list.add(new PessoaFisica(nome, rendaAnual));
				}
			}
			else
			{
				System.out.println("Informe o número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
			
		}

		System.out.println("Impostos pagos: ");
		
		double totalImposto = 0;
		for (Pessoa pessoa : list)
		{
			System.out.println( pessoa.getNome() + ": $ " + pessoa.impostoPago());
			totalImposto += pessoa.impostoPago();
		}
		
		System.out.println("Total de impostos pagos: " + totalImposto);
		
		System.out.println("IMPOSTO É ROUBO!!!!!");
		
		sc.close();
	}

}
