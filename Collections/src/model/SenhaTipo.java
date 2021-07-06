package model;
/**
 * @author Jefferson
 **/
public enum SenhaTipo {
	PADRAO(3),
	PRIORITARIA(1);
	
	private final Integer prioridade;
	private SenhaTipo(Integer prioridade) {
		this.prioridade = prioridade;
	}
	public Integer getPrioridade() {
		return prioridade;
	}
}
