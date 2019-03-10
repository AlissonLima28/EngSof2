package exercicios.unit.br;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TributosTest {

	Tributos funcionario;

	@Test
	public void testarValorINSS() {
		funcionario = new Tributos(1000);
		double vlrINSS = funcionario.calcularINSS();
		Assertions.assertEquals(80, vlrINSS);
	}

	@Test
	public void testarValorINSS2() {
		funcionario = new Tributos(3000);
		double vlrINSS = funcionario.calcularINSS();
		Assertions.assertEquals(330, vlrINSS);
	}

	@Test
	public void testarValorIRRF() {
		funcionario = new Tributos(3500);
		double vlrIRRF = funcionario.calcularIRRF();
		Assertions.assertEquals(170.2, vlrIRRF);
	}

	@Test
	public void testarValorIRRF2() {
		funcionario = new Tributos(5000);
		double vlrIRRF = funcionario.calcularIRRF();
		Assertions.assertEquals(505.64, vlrIRRF);
	}

}
