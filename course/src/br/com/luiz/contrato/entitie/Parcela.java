package br.com.luiz.contrato.entitie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date DataVencimento;
	private double quantidade;

	public Parcela(Date dataVencimento, double quantidade) {
		DataVencimento = dataVencimento;
		this.quantidade = quantidade;
	}

	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return sdf.format(DataVencimento) + " - R$" + String.format("%.2f", quantidade);
	}
}
