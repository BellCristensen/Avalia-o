import javax.swing.JOptionPane;

public class CalcularSerie4 {

	void CalcularSerie( String serie4, double AndersonSerie4, double JoaoSerie4, double AndersonSoSerie4) {
		double media;
		media = (AndersonSerie4 + JoaoSerie4 + AndersonSoSerie4)/3;
		JOptionPane.showMessageDialog(null,
				"\nA nota de Anderson em LTP IV foi:" + " " + AndersonSerie4 +
				"\nA nota de João em LTP IV foi:" + " " + JoaoSerie4 +
				"\nA nota de Anderson em SO foi:" + " " + AndersonSoSerie4 + 
				"\nA média da sala é: "+ media);
	}
}

