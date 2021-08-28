package entities;

public class PessoaFisica extends Pessoa
{
	
	private double gastosSaude = 0.0;
	
	public PessoaFisica()
	{
		
	}
	

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude)
	{
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public PessoaFisica(String nome, double rendaAnual)
	{
		super(nome, rendaAnual);
	}


	public double getGastosSaude()
	{
		return gastosSaude;
	}


	public void setGastosSaude(double gastosSaude)
	{
		this.gastosSaude = gastosSaude;
	}


	@Override
	public double impostoPago()
	{
		if(getRendaAnual() < 20000)
			return getRendaAnual() * 0.15 - getGastosSaude() * 0.5;
		else
			return getRendaAnual() * 0.25 - getGastosSaude() * 0.5;
	}
	
}
