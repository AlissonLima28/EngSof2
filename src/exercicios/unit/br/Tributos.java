package exercicios.unit.br;

public class Tributos {

	private double salario;
	private double inss, irrf;

	public Tributos(double salario) {
		this.salario = salario;
		this.inss = 0;
		this.irrf = 0;
	}

	public double calcularINSS() {
		if (this.salario <= 1693.72) {
			this.inss = this.salario * 0.08;
		} else if (this.salario > 1693.72 && this.salario <= 2822.90) {
			this.inss = this.salario * 0.09;
		} else {
			this.inss = this.salario * 0.11;
		}
		return this.inss;
	}

	public double calcularIRRF() {
		if (this.salario < 1903.99) {
			this.irrf = 0;
		} else if (this.salario >= 1903.99 && this.salario <= 2826.65) {
			this.irrf = (this.salario * 0.075) - 142.80;
		} else if (this.salario >= 2826.66 && this.salario <= 3751.05) {
			this.irrf = (this.salario * 0.15) - 354.80;
		} else if (this.salario >= 3751.06 && this.salario <= 4664.68) {
			this.irrf = (this.salario * 0.225) - 636.13;
		} else {
			this.irrf = (this.salario * 0.275) - 869.36;
		}
		return this.irrf;
	}

}
