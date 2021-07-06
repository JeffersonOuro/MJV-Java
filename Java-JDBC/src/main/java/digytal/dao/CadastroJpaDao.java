package digytal.dao;

import javax.persistence.EntityManager;

import digytal.jpa.connection.FabricaJpaConexao;
import digytal.model.Cadastro;

public class CadastroJpaDao {
	private EntityManager em;
	public CadastroJpaDao() {
		em = FabricaJpaConexao.criarConexao();
	}
	public void incluir(Cadastro cadastro) {
		em.getTransaction().begin();
		//em.persist(cadastro);
		em.merge(cadastro);
		em.getTransaction().commit();
	}
}
