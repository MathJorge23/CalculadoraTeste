package testesCalculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		//TESTES ADCAO
		 
        // Cenario de teste 1: Soma de dois valores
        double soma = c.somar(5, 8);
        System.out.println(soma);
        
        // caso de teste 2: Soma de dois valores  sendo um sendo zero
        soma = c.somar(5, 0);
        System.out.println(soma);
        
        // caso de teste 3: Soma de dois valores sendo que ambos são zero
        soma = c.somar(0, 0);
        System.out.println(soma);
        
        // caso de teste 4: Soma de dois valores sendo que um é negativo
        soma = c.somar(5, -8);
        System.out.println(soma);
        
        // TESTES SUBTRAÇÃO
        
        // caso de teste 1: Subtração de dois valores 
        double subtracao = c.subtrair(5, 8);
        System.out.println(subtracao);
        
        // caso de teste 2: Subtração de dois valores  sendo um sendo zero
        subtracao = c.subtrair(5, 0);
        System.out.println(subtracao);
        
        // caso de teste 3: Subtração de dois valores sendo que ambos são zero
        subtracao = c.subtrair(0, 0);
        System.out.println(subtracao);
        
        // caso de teste 4: Subtração de dois valores sendo que um é negativo
        subtracao = c.subtrair(5, -8);
        System.out.println(subtracao);
        
        //TESTES MULTIPLICACAO
        
        //Caso de teste 1: Multiplicaçao de dois numeros.
        double mult = c.multiplicar(5, 8);
        System.out.println(mult);
        
        //Caso de teste 2: Multplcação de dois valores, sendo um zero
        mult = c.multiplicar(5, 0);
        System.out.println(mult);
        
        //Caso de teste 3: Multiplicação de dois valores sendo ambos zero
        mult = c.multiplicar(0, 0);
        System.out.println(mult);
        
        //Caso de teste 4: Multiplicação de dois valores sendo um negativo
        mult = c.multiplicar(5, -8);
        System.out.println(mult);
        
        //TESTES DIVISÃO
        
        //Caso de teste 1: Divisão de dois valores
        double divi = c.dividir(5, 8);
        System.out.println(divi);
         
        //Caso de teste 2: Divisão de dois valores sendo um zero
        mult = c.multiplicar(5, 0);
        System.out.println(mult);
        
        //Caso de teste 3: Divisão de dois valores, ambos sendo zero
        mult = c.multiplicar(0, 0);
        System.out.println(mult);
        
        //Caso de teste 4: Divisão de dois valores, sendo um negativo
        mult = c.multiplicar(5, 0);
        System.out.println(mult);

	}

}
