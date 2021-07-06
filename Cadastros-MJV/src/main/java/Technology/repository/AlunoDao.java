package digytal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import digytal.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {
	
}
