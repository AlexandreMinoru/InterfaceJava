package banco;

public class Funcionario {
	private int key, idade;
	private String nome, setor;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Funcionario(int key, int idade, String nome, String setor) {
		super();
		this.key = key;
		this.idade = idade;
		this.nome = nome;
		this.setor = setor;
	}



	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}



	@Override
	public String toString() {
		return "Funcionario [key=" + key + ", idade=" + idade + ", nome=" + nome + ", setor=" + setor + "]";
	}
	
	
	
}
