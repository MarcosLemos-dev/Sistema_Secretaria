package cursojava.executavel;



import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Arrayvetor {
	/* usado para executar o codigo */
	public static void main(String[] args) {
		
		double[] notasJava = {2.3,8.9,6.8,9.3};//array de notas para a disciplina java
		double[] notasLogica = {6.3,8.0,6.9,9.2};//array de notas para a disciplina logica
		
		
/* cria��o do aluno*/
		Aluno aluno = new Aluno();// criando o objeto aluno
		aluno.setNome("curso java");
		aluno.setNomeEscola("jdv");
		
		/* cria��o da disciplina 1*/

		Disciplina disciplina  = new Disciplina();//criando o objeto disciplina
		disciplina.setDisciplina("java");
		
		disciplina.setNota(notasJava);
		
		aluno.getDisciplinas().add(disciplina);//colocando a disciplina amarrada com o aluno
		
		/* cria��o da disciplina 2*/
		Disciplina disciplina2  = new Disciplina();//criando o objeto disciplina
		disciplina2.setDisciplina("logica");
		
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("nome do aluno:" + aluno.getNome() + "inscrito no curso: "+ aluno.getNomeEscola());
		System.out.println("--------disciplina do aluno-----");

		for (Disciplina d : aluno.getDisciplinas()) {
			
			
			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println(" A nota da disciplina s�o:");
			
			/*abaixo codigo de calcular a maior valor dentro do array*/
			double notaMax = 0.0;
			
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota " + i + "� igual = " + d.getNota()[i]);
				if(i == 0) {
					notaMax = d.getNota()[i];
				}else
					if(d.getNota()[i] > notaMax) {
						notaMax = d.getNota()[i];
					}
			}
		System.out.println("a maior nota da disciplina = " + d.getDisciplina() + "e de valor : " + notaMax);
		/*fim do codigo de calcular o maior valor dentro do array*/
		}
		
	}
}