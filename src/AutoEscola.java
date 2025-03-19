import java.util.ArrayList;
import java.util.List;

public class AutoEscola {
	private List<Aluno> alunos;
	private List<Instrutor> instrutores;

	public AutoEscola(List<Aluno> alunos) {
		this.alunos = alunos != null ? alunos : new ArrayList<>();
		this.instrutores = new ArrayList<>();

		for (Aluno aluno : this.alunos) {
			if (aluno.getInstrutor() != null && !instrutores.contains(aluno.getInstrutor())) {
				instrutores.add(aluno.getInstrutor());
			}
		}
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void exibirResumo() {
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
