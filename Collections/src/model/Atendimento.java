package model;

/**
 * @author Jefferson
 **/
public class Atendimento implements Comparable<Atendimento> {
	private String nome;
	private String cpf;
	private SenhaTipo tipo;
	
	public Atendimento(String cpf, String nome, SenhaTipo tipo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public SenhaTipo getTipo() {
		return tipo;
	}
	@Override
	public String toString() {
		return "Atendimento [nome=" + nome + ", cpf=" + cpf + ", tipo=" + tipo + "]";
	}
	@Override
	public int compareTo(Atendimento o) {	
		return this.getTipo().getPrioridade().compareTo(o.getTipo().getPrioridade());
	}	
}

