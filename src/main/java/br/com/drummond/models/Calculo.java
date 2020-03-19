package br.com.drummond.models;

public class Calculo {

	private double valor1;
	
	private double valor2;
	
	private String funcao;
	
	private double resultado;
	
	public Calculo(double valor1, double valor2, String funcao) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.funcao = funcao;
		this.resultado = calcular();
	}

	private double calcular() {
		switch(this.funcao) {
			case "somar":
				this.resultado = this.valor1 + this.valor2;
				break;
			case "subtrair":
				this.resultado = this.valor1 - this.valor2;
				break;
			case "multiplicar":
				this.resultado = this.valor1 * this.valor2;
				break;
			case "dividir":
				this.resultado = this.valor1 / this.valor2;
				break;
		}
		
		return this.resultado;
	}
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
