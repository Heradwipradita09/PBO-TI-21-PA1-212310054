
import java.util.Scanner;

public class Selection01 {
	
	public static void main (String[] args) {
		int x,y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x: ");
		x = input.nextInt();
		System.out.print("y: ");
		y = input.nextInt();
		input.close();
		
		System.out.println("Nilai x: "+ x);
		System.out.println("Nilai y: "+ y);
		
		if(x>y) {
			System.out.println("X lebih besar dari Y");
		}
		else {
			System.out.println("X lebih kecil dari Y");	
		}
		
		System.out.println("Selection bercabang");
		if(x==6) {
			System.out.println("X adalah 6");
		}
		else if((x>=1)&&(x<5)) {
			System.out.println("X adalah 1-5");
		}
		else {
			System.out.println("X adalah " + x);	
		}
		System.out.println("short if");
		String z=(y>x)?"Lebih besar" : "Lebih kecil";
		System.out.println("Z " + z);
	}
	

}
