import javax.swing.JOptionPane;

public class CalcularAnderson {

	void CalcularAnderson(double AndersonNotaLtp, double AndersonSo) {
		double media;
		media = (AndersonNotaLtp + AndersonSo)/2;
		JOptionPane.showMessageDialog(null,
				"\nA nota de Anderson em LTP IV foi:" + " " + AndersonNotaLtp +
				"\nA nota de Anderson em SO foi:" + " " + AndersonSo + 
				"\nA média da sala é: "+ media);
	}
}
