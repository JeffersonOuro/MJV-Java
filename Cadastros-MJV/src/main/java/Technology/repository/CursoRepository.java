package digytal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import digytal.model.Curso;

public interface CursoRepository  extends CrudRepository<Curso, Integer> {
	List<Curso> findByNomeContaining(String nome);
}
