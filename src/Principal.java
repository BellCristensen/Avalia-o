import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
	/** Dados dos Alunos*/
	Media MediaAluno1 = new Media();
	MediaAluno1.nome = "Anderson";
	MediaAluno1.disciplina = "LTP IV";
	MediaAluno1.curso = "ADS";
	MediaAluno1.serie = 4;
	
	Media MediaAluno2 = new Media();
	MediaAluno2.nome = "João";
	MediaAluno2.disciplina = "LTP IV";
	MediaAluno2.curso = "ADS";
	MediaAluno2.serie = 4;
	
	Media MediaAluno3 = new Media();
	MediaAluno3.nome = "Joaquim";
	MediaAluno3.disciplina = "SO";
	MediaAluno3.curso = "ADS";
	MediaAluno3.serie = 2;
	
	Media MediaAluno4 = new Media();
	MediaAluno4.nome = "Maria";
	MediaAluno4.disciplina = "LTP IV";
	MediaAluno4.curso = "SO";
	MediaAluno4.serie = 2;
	
	Media MediaAluno5 = new Media();
	MediaAluno5.nome = "Anderson";
	MediaAluno5.disciplina = "LTP IV";
	MediaAluno5.curso = "SO";
	MediaAluno5.serie = 4;
	/**------------------------------------*/
	
	MediaAluno1.nota = 0;
	MediaAluno1.inserirNota(1.5);
	System.out.println("Aluno: " + MediaAluno1.nome + "\nCursando: " + MediaAluno1.curso + 
	"\nDisciplina: " + MediaAluno1.disciplina + "\nObteve a nota: " + MediaAluno1.nota + " na avaliação!" );
	
	MediaAluno2.nota = 0;
	MediaAluno2.inserirNota(9.8);
	System.out.println("\nAluno: " + MediaAluno2.nome + "\nCursando: " + MediaAluno2.curso + 
	"\nDisciplina: " + MediaAluno2.disciplina + "\nObteve a nota: " + MediaAluno2.nota + " na avaliação!\n" );
	
	MediaAluno3.nota = 0;
	MediaAluno3.inserirNota(7.8);
	System.out.println("\nAluno: " + MediaAluno3.nome + "\nCursando: " + MediaAluno3.curso + 
	"\nDisciplina: " + MediaAluno3.disciplina + "\nObteve a nota: " + MediaAluno3.nota + " na avaliação!" );
	
	MediaAluno4.nota = 0;
	MediaAluno4.inserirNota(3.4);
	System.out.println("\nAluno: " + MediaAluno4.nome + "\nCursando: " + MediaAluno4.curso + 
	"\nDisciplina: " + MediaAluno4.disciplina + "\nObteve a nota: " + MediaAluno4.nota + " na avaliação!" );
	
	MediaAluno5.nota = 0;
	MediaAluno5.inserirNota(5.4);
	System.out.println("\nAluno: " + MediaAluno5.nome + "\nCursando: " + MediaAluno5.curso + 
	"\nDisciplina: " + MediaAluno5.disciplina + "\nObteve a nota: " + MediaAluno5.nota + " na avaliação!" );
	
	/**Média do Curso ADS*/
	
	CalcularMedia mediaAds = new CalcularMedia();
	
	double notaAnderson;
	double notaJoaquim;
	double notaJoao;
	double notaMaria;
	double notaAnderson1;
	String nome, disciplina;
	
	
	disciplina = JOptionPane.showInputDialog(null, "Informe o curso: ");
	notaAnderson = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Anderson em LTP IV : "));
	notaJoao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de João em LTP IV : "));
	notaJoaquim = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Joaquim em SO : "));
	notaMaria = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Maria em SO : "));
	notaAnderson1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Anderson em SO : " ));

	
	mediaAds.Calcular( disciplina, notaAnderson, notaJoao, notaJoaquim, notaMaria, notaAnderson1);
	
	/**Média da Série 4*/

	CalcularSerie4 mediaSerie = new CalcularSerie4();
	String serie4;
	double AndersonSerie4, JoaoSerie4, AndersonSoSerie4; 
	
	serie4 = JOptionPane.showInputDialog(null, "Informe o curso: ");
	AndersonSerie4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Anderson em LTP IV : "));
	JoaoSerie4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Joaquim em LTP IV : "));
	AndersonSoSerie4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Anderson em SO : "));
	
	mediaSerie.CalcularSerie( serie4, AndersonSerie4, JoaoSerie4, AndersonSoSerie4);
	
	/**Média do Anderson*/
	CalcularAnderson mediaAnderson = new CalcularAnderson();
	double AndersonNotaLtp, AndersonSo; 
	
	AndersonNotaLtp = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Anderson em LTP IV : "));
	AndersonSo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de Anderson em SO : "));
	
	mediaAnderson.CalcularAnderson(AndersonNotaLtp, AndersonSo );
	}
}
