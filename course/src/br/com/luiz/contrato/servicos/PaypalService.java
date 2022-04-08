package br.com.luiz.contrato.servicos;

public class PaypalService implements ServicoPagamentoOnline {
	
	private static final double PORCENTAGEM_TAXA = 0.02;
	private static final double JUROS_MES = 0.01;
	
	@Override
	public double taxaDePagamento(double quantidade) {
		return quantidade * PORCENTAGEM_TAXA;
	}
	@Override
	public double interest(double quantidade, int meses) {
		return quantidade * JUROS_MES * meses;
	}

}
