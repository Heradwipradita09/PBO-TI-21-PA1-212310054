import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class Latihan03 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		int ordo = 2;
		String output = "";
		
		ArrayList<ArrayList<String> > field = new ArrayList<ArrayList<String> >();
		
		for (int h = 0; h <= ordo; h++) {
			field.add(new ArrayList<String>());
		}
		
		field.get(0).add(0, "Nama Lengkap");
		field.get(0).add(1, "Alamat");
		field.get(0).add(2, "No Telp");

		for(int h = 0; h <= ordo; h++) {
			output += field.get(0).get(h) + " ";
		}
		
		output += "\n";
		
		for(int h = 0; h <= ordo; h++) {
			for(int e = 0; e <= ordo; e++) {
				String isi = jop.showInputDialog(null, "Masukkan " + field.get(0).get(e) + ":", "Data array ke-" + h, jop.QUESTION_MESSAGE);
				field.get(1).add(e, isi);
				output += field.get(1).get(e) + " | ";
			}
			
			output += "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}
