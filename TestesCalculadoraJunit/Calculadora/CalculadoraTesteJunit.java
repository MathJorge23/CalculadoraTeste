package Calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
class CalculadoraTesteJunit extends Calculadora {

	
	//TESTES ADIÇÃO
	@SuppressWarnings("deprecation")
	@Test
	void SomarDoisNumerosPositivos() {
		Calculadora cal = new Calculadora();
		 double soma = cal.somar(7, 8);
		 Assert.assertEquals(10,soma);
	}

	@Test
	void SomarDoisNumerosNegativos() {
		Calculadora cal = new Calculadora();
		double soma = cal.somar(-10, -30);	
		 Assert.assertEquals(-40,soma);
	}
	
	@Test
	void SomarNUmNegativoePositivo() {
		Calculadora cal = new Calculadora();
		double soma = cal.somar(10, -30);	
		 Assert.assertEquals(-20,soma);
	}
	
	@Test 
	void SomarDoisZero(){
		Calculadora cal = new Calculadora();
		double soma = cal.somar(-0, -0);	
		 Assert.assertEquals(0,soma);
	}
	
	//TESTES DIVISÃO
	
	@Test
	public void DividirDoisZero() {
		Calculadora cal = new Calculadora();
		double div = cal.dividir(0, 0);
		Assert.assertEquals(10, div);
	}
	
	@Test 
	void DividirNumerosPositivos() {
		Calculadora cal = new Calculadora();
		double div = cal.dividir(10, 10);
		Assert.assertEquals(1, div);
	}
	
	@Test
	void DividirNumerosNegativos() {
		Calculadora cal = new Calculadora();
		double div = cal.dividir(-20, 10);
		Assert.assertEquals(-2, div);
	}
	
	@Test 
	void DividirPositivoComNegativo() {
		Calculadora cal = new Calculadora();
		double div = cal.dividir(-30, 10);
		Assert.assertEquals(-3, div);
	}
	
	//TESTES SUBTRAÇÃO
	@Test
	void SubtrairDoisNumerosPOsitivos() {
		Calculadora cal = new Calculadora();
		double sub = cal.subtrair(50, 10);
		Assert.assertEquals(40, sub);
	}
	
	@Test
	void SubtrairDoisNumerosNegativos() {
		Calculadora cal = new Calculadora();
		double sub = cal.subtrair(-50, -10);
		Assert.assertEquals(40, sub);
	}
	
	@Test
	void SubtrairZero() {
		Calculadora cal = new Calculadora();
		double sub = cal.subtrair(0, 0);
		Assert.assertEquals(0, sub);
	}
		
	@Test
	void SubtrairDeZero() {
		Calculadora cal = new Calculadora();
		double sub = cal.subtrair(0, 10);
		Assert.assertEquals(0, sub);
	}
	// TESTE MULTIPLICAÇÃO
	@Test
	void MultiplicarDoisNumeros() {
		Calculadora cal = new Calculadora();
		 double mult = cal.multiplicar(7, 5);
		 Assert.assertEquals(35,mult);
	}

	@Test
	void MultiplicarDoisNumerosNegativos() {
		Calculadora cal = new Calculadora();
		double mult = cal.multiplicar(-10, -30);	
		 Assert.assertEquals(-40,mult);
	}
	
	@Test
	void MultiplicarPositivoENegativo() {
		Calculadora cal = new Calculadora();
		double mult = cal.multiplicar(10, -30);	
		 Assert.assertEquals(-300,mult);
	}
	
	@Test 
	void MultiplicarPorZero(){
		Calculadora cal = new Calculadora();
		double mult = cal.multiplicar(-0, -0);	
		 Assert.assertEquals(0,mult);
	}
}
