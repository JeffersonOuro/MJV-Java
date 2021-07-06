package digytal;

public class Operadores {
	public static void main(String[] args) {
		//logicos();
		logicosHard();
	}
	
	static void logicosHard() {
		int n1=1;
		int n2=2;
		if(n1==n2 & ++n1==n2)
			System.out.println("bingo ");
		System.err.println( n1 + " -- " + n2);
		
		n1=1;
		n2=2;
		if(n1==n2 && ++n1==n2)
			System.out.println("bingo ");
		System.err.println( n1 + " -- " + n2);
		
		n1=1;
		n2=2;
		if(++n1==n2 && ++n1>n2)
			System.out.println("bingo ");
		System.err.println( n1 + " -- " + n2);
		
		n1=1;
		n2=2;
		if(++n1==n2 | ++n1>=n2)
			System.out.println("bingo ");
		System.err.println( n1 + " -- " + n2);
		
		n1=1;
		n2=2;
		if(++n1==n2 || ++n1>=n2)
			System.out.println("bingo ");
		System.err.println( n1 + " -- " + n2);
	}
	static void logicos() {
		Boolean validacao1=true;

		Boolean validacao2=true;

		if(validacao1 && validacao2)
			System.out.println("Os dois valores precisam ser verdadeiros");

		if(validacao1 || validacao2)
			System.out.println("Um dos valores precisa ser verdadeiro");

	}
	static void ternario(int nota) {
		boolean aprovado = nota >= 7;
		String resultado=aprovado?"APROVADO":"REPROVADO";
		/*
		if(aprovado)
			resultado="APROVADO";
		else
			resultado = "REPROVADO";
		*/
		System.out.println(resultado);
	}
	static void relacionais() {
		int a = 1;
		int b = 1;
		
		if(b==a) {
			
		}
		if(b!=a) {
			
		}
	}
	static void unario() {
		int n = 1;
		System.out.println(-n);
		System.out.println(++n);
		
		boolean verdadeira = true;
		if(!verdadeira) {
			//faz alguma coisa
		}
		
	
	}
	static void atribuicao() {
		Integer n1 = 1;
		String n2 = "1";
		Integer n3=1;
		
		System.out.println(n1+n2+n3);
		
		System.out.println(n1+n3+n2);
		
		System.out.println(n2+(n3+n1));
		
		System.out.println(n1+n3+n2+n1);
	}
}
