
public class Main {

	public static void main(String[] args) {
		// Processamento de dados em java, casting(conversão do valor de uma variavel chamado em outra)
		//Exercicio 2
		//int x, y; // nessa linha eu declarei o nome de duas variaveis
		//x = 5; // nessa linha eu dei valor a uma das variaveis declaradas acima
		//y = 2 * x;//o (= igual) significa que a variavel crida vai receber o valor definido e nessa linha fiz também a multiplicação do valor da variavel x
		
		//System.out.println(x);//o camando System.out.println diz que vou mandar o valor da variavel esclhida para o console
		//System.out.println(y);
		
		//Exercicio 2
		//int x;
		//double y;//a unica diferença desse exercicio para o de cima é que esse tem uma variavel do tipo flutuante a impressão sera ao invés de 10 será 10.0
		
		//x = 5;
		//y = 2 * x;
		
		//System.out.println(x);
		//System.out.println(y);
		
		//Exercicio 3 Esse exercicio é um trapezio trazer o resultado da media das bases * a altura
		//double b, B, h, area; //declaração das variaveis em ponto flutuante
		
		//b = 6.0;//variavel base superior é uma boa pratica colocar sempre o .0
		//B = 8.0;//varaival da base inferior do trapezio
		//h = 5.0;//variavel da alltura do trapezio
		
		//area = (b + B) / 2.0 * h;//aqui a area vai receber os valores das variaveis declaradas dividada por 2. Isso é um regra de 3
		//System.out.println(area);//Na impressão eu trago somente a varaivel area que ja recebeu os valores acima aqui vem somente o resultado.

		
		//Caso for uma varivel do tipo flutuante colocar um (f) apos cada numero como segue no exemplo significa por flutuante simple ISSO É UMA BOA PRATICA
		//Exercicio 4
		
		//float b, B, h, area;
		
		//b = 6f;
		//B = 8f;
		//h = 5f;
		
		//area = (b + B) / 2f * h;
		//System.out.println(area);
		
		//Exercicio 5
		//int a, b; //declaração de variaveis do tipo inteiro
		//double resultado; //declaração de varaivel do tipo double ponto flutuante
		
		//a = 5; //aqui eu dei o valor para a variavel
		//b = 2;
		
		//resultado =  a / b;//por mais que a variavel resultado seja do tipo double(.flutuante) o resultado que predomina é das variaveis int que não é do tipo flutuante
		
		//System.out.println(resultado);
		
		//Exercicio 5 Para avisar ao compilador que é pra dar um resultado do tipo double (.flutuante)
		
		//int a, b;
		//double resultado;
		
		//a = 5; //aqui eu dei o valor para a variavel
		//b = 2;
		
		//resultado = (double)  a / b;//para o resultado ser do tipo double .flutuante ou seja o valor 2.5 é necessario declarar  double entre parenteses antes da divisão.
		
		//System.out.println(resultado);
		
		
		//Exercicio 6 Para colocar o valor de uma variavel do tipo double em uma do tipo int é necessario declarar novamente dentro da varaivel que é pra colocar o resultado.
		
		double a;
		int b;
		
		a = 5.0;
		b = (int) a;//Isso é o processo de casting
		
		System.out.println(b);
		
		
		
		
	}
	

}
