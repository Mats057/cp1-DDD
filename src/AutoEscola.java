public class AutoEscola {
	Aluno[] alunos;

	public AutoEscola(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public void exibirResumo() {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].toString());
		}
	}
}
