package digytal.jpa.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaJpaConexao {
	public static EntityManager criarConexao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_AULA");
		return factory.createEntityManager();
	}

}
