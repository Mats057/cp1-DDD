public class Instrutor {
	private String nome;
	private int anosExperiencia;
	private String categoria;

	public Instrutor(String nome, int anosExperiencia, String categoria) {
		this.nome = nome;
		this.anosExperiencia = anosExperiencia;
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getNome() {
		return nome;
	}
}
