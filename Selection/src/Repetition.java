import java.util.Scanner;
public class Repetition {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = input.nextInt();
		if (x > 1) {
			for (int i= 0; i < x; i++) {
				String koma = (i < x-1)? "," : "";
				System.out.print(i + koma);
				}	
			}
		else {
			System.out.println("nilai terlalu kecil 1");
			}
		}
}
