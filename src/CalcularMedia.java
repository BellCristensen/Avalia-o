import javax.swing.JOptionPane;

public class CalcularMedia {

	void Calcular ( String disciplina, double notaAnderson, double notaJoao,  double notaJoaquim, double notaMaria, double notaAnderson1) {
		double media;
		media = (notaAnderson + notaJoaquim + notaJoao + notaMaria)/5;
		JOptionPane.showMessageDialog(null,
				"Disciplina : " + disciplina +
				"\nA nota de Anderson em LTP IV foi:" + " " + notaAnderson +
				"\nA nota de João em LTP IV foi:" + " " + notaJoao +
				"\nA nota de Joaquim em SO foi:" + " " + notaJoaquim +
				"\nA nota de Maria em SO foi:" + " " + notaMaria +
				"\nA nota de Anderson em SO foi:" + " " + notaAnderson1 + 
				"\nA média da sala é: "+ media);
	}
}
