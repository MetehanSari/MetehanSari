import java.util.Scanner;

public class SinifAtlama {

	public static void main(String[] args) {
		int turkce,matematik,fenBilgisi,sosyalBilgisi,bedenE�itimi;
		double ortalama=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("T�rk�e notunu Giriniz:");
		turkce = scan.nextInt();
		System.out.println("Matematik notunu Giriniz:");
		matematik = scan.nextInt();		
		System.out.println("Fen Bilgisi notunu Giriniz:");
		fenBilgisi = scan.nextInt();
		System.out.println("Sosyal Bilgisi notunu Giriniz:");
		sosyalBilgisi = scan.nextInt();
		System.out.println("Beden e�itimi notunu Giriniz:");
		bedenE�itimi = scan.nextInt();
		ortalama =(turkce+fenBilgisi+sosyalBilgisi+bedenE�itimi+matematik)/5;
		System.out.println(ortalama);
		if (ortalama >=50 ) {
			System.out.println("S�n�f� " + ortalama +" ile ge�tiniz");
		}
		else {
			System.out.println(ortalama +  " ile s�n�fta kald�n�z");
		}
		
		
		

	}

}
