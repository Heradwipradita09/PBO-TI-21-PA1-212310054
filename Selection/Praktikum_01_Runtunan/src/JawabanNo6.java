import java.util.Scanner;
public class JawabanNo6 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Masukkan usia : ");
		String usia = keyboard.nextLine();
		
		System.out.println("Masukkan nama depan: ");
		String namaDepan = keyboard.nextLine();
		
		System.out.println("Masukkan nama belakang: ");
		String namaBelakang = keyboard.nextLine();
		
		System.out.println("Masukkan NPM: ");
		String npm = keyboard.nextLine();
		
		String str = usia.concat(namaDepan).concat(namaBelakang).concat(npm);
		System.out.println(str);
		
	}

}
