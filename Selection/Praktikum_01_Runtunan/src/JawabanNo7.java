import java.util.Scanner;
public class JawabanNo7 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Masukkan nama lengkap anda : ");
		String nama = keyboard.nextLine();
		String x = "Hera Dwi Pradita";
		
		x = x.replaceAll( "[aeiouAEIOU]", "X" );
		System.out.println(x);
	}

}
