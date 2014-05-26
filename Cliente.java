public class Cliente {
	private String nome;
	private int numero;
	private Agencia agencia;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void cadastraAgencia(Agencia agencia){
		this.agencia = new Agencia();
	}
	
	public Agencia getAgencia(){
		return this.agencia;
	}
}
