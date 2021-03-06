package br.com.luiz.contrato.servicos;

import java.util.Calendar;
import java.util.Date;

import br.com.luiz.contrato.entitie.Contrato;
import br.com.luiz.contrato.entitie.Parcela;

public class ServicoDeContrato {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoDeContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processoDeContrato(Contrato contrato, int meses) {
		double cotaBasica = contrato.getValorTotalContrato()/meses;
		for (int i =1; i <= meses; i++) {
			Date data = addMeses(contrato.getData(), i);
			double atualizacaoCota = cotaBasica + servicoPagamentoOnline.interest(cotaBasica, i);
			double cotaCompleta = atualizacaoCota + servicoPagamentoOnline.taxaDePagamento(atualizacaoCota);
			contrato.addParcela(new Parcela(data, cotaCompleta));
		}
	}
	
	private Date addMeses (Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
