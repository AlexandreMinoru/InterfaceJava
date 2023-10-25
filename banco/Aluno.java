package banco;

public class Aluno {
	private int key;
	private String nome, telefone;
	private double nota;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Aluno(int key, String nome, String telefone, double nota) {
		super();
		this.key = key;
		this.nome = nome;
		this.telefone = telefone;
		this.nota = nota;
	}



	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}



	@Override
	public String toString() {
		return "Aluno [key=" + key + ", nome=" + nome + ", telefone=" + telefone + ", nota=" + nota + "]";
	}
	
	
	
}
