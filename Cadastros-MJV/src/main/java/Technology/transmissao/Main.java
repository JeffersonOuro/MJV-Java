package transmissao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = byAnt();
		Transmissor transmissor = ctx.getBean(Transmissor.class);
		transmissor.enviar(1, "Chegou sua fatura -- ohh no");
	}
	static ApplicationContext byXml() {
		return new ClassPathXmlApplicationContext("beans.xml");
	}
	static ApplicationContext byAnt() {
		return new AnnotationConfigApplicationContext(Beans.class);
	}
}
