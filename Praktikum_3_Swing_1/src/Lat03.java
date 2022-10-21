import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Lat03 {
	
	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		String NamaLengkap, alamat, Umur;
		
		NamaLengkap = JOptionPane.showInputDialog(
				null, 
				"masukan NamaLengkap anda:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		);
		
		alamat = JOptionPane.showInputDialog(
				null, 
				"masukan alamat anda:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		);
		
		Umur = JOptionPane.showInputDialog(
				null, 
				"masukan Umur anda:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		);
		
		if(NamaLengkap.isEmpty() && alamat.isEmpty() && Umur.isEmpty()) {
				JOptionPane.showMessageDialog(
						null, 
						"Field NamaLengkap/usia/alamat tidak boleh kosong", 
						"Error Message", 
						JOptionPane.ERROR_MESSAGE);
		}

		else 
			if(!Pattern.matches("^[0-9]+$", Umur)) {
			JOptionPane.showMessageDialog(
					null, 
					"Isian usia harus angka",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		else if(alamat.length() < 10) {
			JOptionPane.showMessageDialog(
					null, 
					"Masukan alamat minimum 10 karakter",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(
					null, 
					"Seluruh informasi telah dimasukan",
					"Output Message", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}

}
