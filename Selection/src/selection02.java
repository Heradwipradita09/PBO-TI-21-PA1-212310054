import java.util.Scanner;

public class selection02 {
	
	public static void main (String[] args) {
		String x;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x: ");
		x = input.nextLine();
		System.out.print("y: ");
		y = input.nextInt();
		input.close();
		
		System.out.println("Nilai x: "+ x);
		System.out.println("Nilai y: "+ y);
		switch (x) {
		case "PBO" :{
			System.out.println("Anda benar");
			break;
		}
		default:
			System.out.println("Anda salah");
		}
		switch (y) {
		case 2:{
			System.out.println("Nilai x adalah 2");
			break;
		}
		default:
			System.out.println("Nilai y bukan 2");
		}	
	}
}
