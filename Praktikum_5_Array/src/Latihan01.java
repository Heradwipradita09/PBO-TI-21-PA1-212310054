import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Latihan01 {
	public static void main(String[] args) {
		int length = 2;
		String value = "";
		ArrayList<ArrayList<Integer> > matriksA =
		new ArrayList<ArrayList<Integer> >();
		ArrayList<ArrayList<Integer> > matriksB =
		new ArrayList<ArrayList<Integer> >();
		

		for(int h =0; h<length; h++) {
			for(int e=0; e<length; e++) {
			matriksA.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+h+"]"+"["+e+"]",JOptionPane.QUESTION_MESSAGE);
			matriksA.get(h).add(e, Integer.parseInt(value));
		}
			}
		for(int h =0; h<length; h++) {
			for(int e=0; e<length; e++) {
			matriksB.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks B ke-["+h+"]"+"["+e+"]",JOptionPane.QUESTION_MESSAGE);
			matriksB.get(h).add(e, Integer.parseInt(value));
		}
			}
		
		String output = "Matrix A: \n";
		for(int h =0; h<length; h++) {
			for(int e=0; e<length; e++) {
			output += matriksA.get(h).get(e) + " ";
		}
			output += "\n";
			}
		String output1="Matrix B: \n";
		for(int h =0; h<length; h++) {
			for(int e=0; e<length; e++) {
			output1 += matriksB.get(h).get(e) + " ";
		}
			output1 += "\n";
			}
		
		JOptionPane.showMessageDialog(null, output+output1);
		
	}

}
