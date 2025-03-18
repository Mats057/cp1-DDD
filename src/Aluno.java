public class Aluno {
	private String nome;
	private int idade;
	private Veiculo veiculo;
	private int aulasTeoricas;
	private int aulasPraticas;
	private boolean aprovado;

	public Aluno(String nome, int idade, Veiculo veiculo) {
		this.nome = nome;
		this.idade = idade;
		this.veiculo = veiculo;
	}

	public void agendarAulaTeorica() {
		this.aulasTeoricas += 1;
	}

	public void agendarAulaPratica() {
		this.aulasPraticas += 1;
	}

	public void cancelarAulaTeorica() {
		if (this.aulasTeoricas > 0) {
			this.aulasTeoricas -= 1;
		}
	}

	public void cancelarAulaPratica() {
		if (this.aulasPraticas > 0) {
			this.aulasPraticas -= 1;
		}
	}

	public void realizarExame(){
		if (this.aulasTeoricas >= 5 && this.aulasPraticas >= 5) {
			this.aprovado = Math.random() < 0.5;
		}
		System.out.println("Por favor, realize no mínimo 5 aulas teóricas e 5 aulas práticas!");
	}

	@Override
	public String toString() {
		return String.format("""
        ------------------------------
        Nome:           %s
        Idade:          %d
        Tipo Veículo:   %s
        Aulas Teóricas: %d
        Aulas Práticas: %d
        Aprovado:       %s
        ------------------------------
        """,
			nome, idade, veiculo.getTipo(), aulasTeoricas, aulasPraticas, aprovado ? "Sim" : "Não"
		);
	}
}
