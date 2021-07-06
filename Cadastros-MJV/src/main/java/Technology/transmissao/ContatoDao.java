package transmissao;

import org.springframework.stereotype.Repository;
@Repository
public class ContatoDao {
	public Contato find(Integer id) {
		Contato contato = new Contato();
		contato.setNome("GLEYSON");
		contato.setTelefone(1198765432l);
		return contato;
	}
}
