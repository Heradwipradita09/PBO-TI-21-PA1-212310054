import java.util.Scanner;
public class Latihan03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu Makanan : ");
        System.out.println("-------------------------------");
        System.out.println("No Nama                   Harga");
        System.out.println("1. Nasi Goreng          Rp 22.000");
        System.out.println("2. Bubur Ayam           Rp 15.000");
        System.out.println("3. Soto Ayam            Rp 25.000");
        System.out.println("");
        
        int harga = 0;
        int h1 = 22000, h2 = 15000, h3 = 25000;
        String menu;
        {
        	
        System.out.println("-------------------------------");

        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        
        System.out.println("--------------------------------");
        if (inNomor == 1)
        {
        	//jika nomor satu, maka makanan yang dipilih adalah Nasi Goreng
        	menu = "Nasi Goreng";
            System.out.println("Pilihan anda nomor " + inNomor + menu);
            harga = harga + h1;
            }
            else if (inNomor == 2)
            {
            	//jika nomor dua, maka makanan yang dipilih adalah Bubur Ayam
                menu = "Bubur Ayam";
                System.out.println("Pilihan anda nomor " + inNomor + menu);
                harga = harga + h2;
            }
            else if (inNomor == 3)
            {
            	//jika nomor tiga, maka makanan yang dipilih adalah Soto Ayam
                    menu = "Soto Ayam";
                    System.out.println("Pilihan anda nomor " + inNomor + menu);
                    harga = harga + h3;
             }
            else
            	//jika yang dimasukan nomornya tidak ada dalam pilihan maka cetak "Maaf menu yang anda masukan salah"
            	{
            	System.out.println("Maaf menu yang anda masukan salah");
            	}
        
        System.out.println("------------------------------------");
        System.out.println("Total pembayaran sebesar " +"Rp "+harga);
        System.out.println("Terimakasih atas kunjungannya");
        }
	}
}
