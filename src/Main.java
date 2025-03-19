import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Veiculo clio = new Veiculo("Carro", "1231435", "Renault Clio 2018");
		Instrutor cleber = new Instrutor("Cleber", 12, "Carro");
		Instrutor laelson = new Instrutor("Laelson", 6, "Moto");
		Aluno aluno1 = new Aluno("João", 19, clio, cleber);
		Aluno aluno2 = new Aluno("Roberto", 25, clio, laelson);
		Aluno aluno3 = new Aluno("Clara", 22, cleber);
		Aluno aluno4 = new Aluno("Ana", 52, clio);

		AutoEscola autoEscola = new AutoEscola(new ArrayList<>(Arrays.asList(aluno1, aluno2, aluno3, aluno4)));

		System.out.println("Tentando adicionar aulas:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Aluno1 - Agendando aula teórica: "+aluno1.agendarAulaTeorica());
			System.out.println("Aluno1 - Agendando aula prática: "+aluno1.agendarAulaPratica());
			System.out.println("Aluno2 - Agendando aula teórica: "+aluno2.agendarAulaTeorica());
		}

		System.out.println("Aluno2 - Agendando aula prática: "+aluno2.agendarAulaPratica());
		System.out.println("Aluno3 - Agendando aula prática: "+aluno3.agendarAulaPratica());
		System.out.println("Aluno4 - Agendando aula prática: "+aluno4.agendarAulaPratica());

		System.out.println("\nTentando realizar o exame com o Aluno1\n");
		System.out.println(aluno1.realizarExame());
		System.out.println(aluno1.toString());

		System.out.println("\nTentando realizar o exame com o Aluno2 e cancelando a aula teórica em seguida\n");
		System.out.println(aluno2.realizarExame());
		System.out.println(aluno2.cancelarAulaTeorica());
		System.out.println(aluno2.toString());

		System.out.println("\nTentando cancelar aula inexistente com o Aluno3\n");
		System.out.println(aluno3.cancelarAulaPratica());
		System.out.println(aluno3.toString());

		System.out.println("\nTentando cadastrar Veículo para o Aluno3\n");
		System.out.println(aluno3.setVeiculo(clio));
		System.out.println(aluno3.toString());

		System.out.println("\nTentando cadastrar Instrutor para o Aluno4\n");
		System.out.println(aluno4.setInstrutor(cleber));
		System.out.println(aluno4.toString());

		System.out.println("\nTodos os alunos da Autoescola autoEscola:\n");
		autoEscola.exibirResumo();
	}
}