import javax.swing.JOptionPane;

public class Lat02 {
	
	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		myBio.setNamaLengkap(JOptionPane.showInputDialog(
				null, 
				"masukan NamaLengkap anda:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));
		
		myBio.setUmur(Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"masukan Umur anda:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		)));
		
		myBio.setAlamat(JOptionPane.showInputDialog(
				null, 
				"masukan alamat anda:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));

		JOptionPane.showMessageDialog(
				null, 
				"NamaLengkap anda adalah " + myBio.NamaLengkap() 
				+ "\nUmur anda adalah " + myBio.getUmur() + " tahun  " 
				+ "\nalamat anda adalah " + myBio.getAlamat());
	}


}
