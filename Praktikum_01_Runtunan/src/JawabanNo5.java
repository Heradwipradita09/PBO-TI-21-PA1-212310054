import java.util.Scanner;
public class JawabanNo5 {
	
		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Masukkan kalimat yang akan di ubah : ");
			String input = keyboard.nextLine();
			
			System.out.println("Perubahan oleh sistem menjadi :");
			System.out.println(input.toUpperCase());
			
		}


}
