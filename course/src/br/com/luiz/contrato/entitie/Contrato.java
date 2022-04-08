package br.com.luiz.contrato.entitie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numero;
	private Date data;
	private double valorTotalContrato;
	
	private List<Parcela> parcelas = new ArrayList<>();

	public Contrato(int numero, Date data, double valorTotalContrato) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorTotalContrato = valorTotalContrato;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	public void addParcela(Parcela parcela) {
		parcelas.add(parcela);
	}

	public void removeParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}

}
