public class Aluno {
	private String nome;
	private int idade;
	private Veiculo veiculo;
	private Instrutor instrutor;
	private int aulasTeoricas;
	private int aulasPraticas;
	private boolean aprovado;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno(String nome, int idade, Veiculo veiculo) {
		this.nome = nome;
		this.idade = idade;
		this.veiculo = veiculo;
	}

	public Aluno(String nome, int idade, Instrutor instrutor) {
		this.nome = nome;
		this.idade = idade;
		this.instrutor = instrutor;
	}

	public Aluno(String nome, int idade, Veiculo veiculo, Instrutor instrutor) {
		this.nome = nome;
		this.idade = idade;
		this.veiculo = veiculo;
		this.instrutor = instrutor;
	}

	public String agendarAulaTeorica() {
		if (this.instrutor != null) {
			this.aulasTeoricas++;
			return "Aula agendada com sucesso!";
		}
		return "Adicione um instrutor antes de agendar a aula teórica";
	}

	public String agendarAulaPratica() {
		if (this.instrutor != null && this.veiculo != null && this.instrutor.getCategoria().equals(this.veiculo.getTipo())) {
			this.aulasPraticas++;
			return "Aula agendada com sucesso!";
		}
		return "Adicione um instrutor e um veículo compatível antes de agendar a aula prática!";
	}

	public String cancelarAulaTeorica() {
		if (this.aulasTeoricas > 0) {
			this.aulasTeoricas -= 1;
			return "Aula cancelada com sucesso!";
		}
		return "Nenhuma aula teórica encontrada!";
	}

	public String cancelarAulaPratica() {
		if (this.aulasPraticas > 0) {
			this.aulasPraticas -= 1;
			return "Aula cancelada com sucesso!";
		}
		return "Nenhuma aula prática encontrada!";
	}

	public String realizarExame(){
		if (this.aprovado){
			return "Você já passou na prova anteriormente!";
		}
		if (this.aulasTeoricas >= 5 && this.aulasPraticas >= 5) {
			this.aprovado = Math.random() < 0.5;
			return "Você foi "+ (this.aprovado?"aprovado. Parabéns!" : "reprovado, tente novamente!");
		}
		return "Por favor, realize no mínimo 5 aulas teóricas e 5 aulas práticas!";
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public String setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
		return "Instrutor adicionado com sucesso!";
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public String setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
		return "Veículo adicionado com sucesso!";
	}

	@Override
	public String toString() {
		return String.format(
			"------------------------------\n" +
				"Nome:           %s\n" +
				"Idade:          %d\n" +
				"Tipo Veículo:   %s\n" +
				"Aulas Teóricas: %d\n" +
				"Aulas Práticas: %d\n" +
				"Aprovado:       %s\n" +
				"Instrutor:      %s\n" +
				"------------------------------\n",
			nome,
			idade,
			(veiculo != null ? veiculo.getTipo() : "Não informado"),
			aulasTeoricas,
			aulasPraticas,
			(aprovado ? "Sim" : "Não"),
			(instrutor != null ? instrutor.getNome() : "Nenhum")
		);
	}

}
