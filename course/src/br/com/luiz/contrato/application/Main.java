package br.com.luiz.contrato.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.luiz.contrato.entitie.Contrato;
import br.com.luiz.contrato.entitie.Parcela;
import br.com.luiz.contrato.servicos.PaypalService;
import br.com.luiz.contrato.servicos.ServicoDeContrato;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/mm/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do Contrato: ");
		double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorContrato);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ServicoDeContrato servicoDeContrato = new ServicoDeContrato(new PaypalService());
		
		servicoDeContrato.processoDeContrato(contrato, n);
		
		System.out.println();
		System.out.println("### PARCELAS ###");
		for (Parcela x : contrato.getParcelas()) {
			System.out.println(x);
		}
		
		
		sc.close();
	}
}
