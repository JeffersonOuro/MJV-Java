package digytal;

import java.util.Arrays;
import java.util.List;

public class ControleFluxo {
	public static void main(String[] args) {
		//forEach();
		//arrays();
		//forContinue();
		forBreak();
	}
	static void forBreak() {
		// eu quero imprimir de 1 a 10 mas não os numero 5,8
		for(int x = 1; x <=10; x++) {
			if(x==5 || x==8)
				break;
			System.out.println(x);
		}
	}
	static void forContinue() {
		// eu quero imprimir de 1 a 10 mas não os numero 5,8
		
		for(int x = 1; x <=10; x++) {
			if(x==5 || x==8)
				continue;
			
			System.out.println(x);
		}
	}
	static void arrays(){
		String [] nulo = null;
		String [] vazio = {};
		//System.out.println(vazio.length);
		String [] nomes = new String[5];
		nomes[0]="A";
		nomes[1]="B";
		nomes[2]="C";
		nomes[3]="D";
		nomes[3]="E";
		nomes[4]="Z";
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		String nomes2 [] = {"a","b","c","d"};

		receberArray(nomes2);
		receberVarArgs(nomes2);
		
		
		receberVarArgs("a","b","c","d");
		
		//receberArray("a","b","c","d");
		
	}
	static void receberVarArgs(String ... var) {
		
	}
	static void receberArray(String [] var) {
		
	}
	//recursividade
	static int fatorial(int num) {
		if(num==0)
			return 1;
		return num * fatorial(num-1);
	}

	static void exemploDoWhile() {
		int x=6;
		do {
			System.out.println(x++);
		}while(x<=5 );
	}
	static void exemploWhile() {
		int x=6;
		while (x<=5) {
			System.out.println(x++);
		}
	}
	static void forEach() {
		String nomes[]  ={"JOSE","MARCOS","PEDRO"};
		for(String nome : nomes) {
			//System.out.println(nome);
		}
		List<String> lnomes = Arrays.asList(nomes);
		
		//java lambda funcional
		lnomes.stream().forEach(n->System.out.println(n));
		
	}
	static void exemploFor() {
		//quando temos um fator contagem, sendo podemos incrementar algum valor
		//em cada ocorrencia
		
		int x=0;
		for(start(); x<10; replay() ) {
			System.out.println(++x);
		}
	}
	static void start() {
		System.out.println("start");
	}
	static void replay() {
		System.out.println("replay");
	}
}
