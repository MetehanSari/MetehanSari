import java.util.Scanner;

public class SinifAtlama {

	public static void main(String[] args) {
		int turkce,matematik,fenBilgisi,sosyalBilgisi,bedenEðitimi;
		double ortalama=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Türkçe notunu Giriniz:");
		turkce = scan.nextInt();
		System.out.println("Matematik notunu Giriniz:");
		matematik = scan.nextInt();		
		System.out.println("Fen Bilgisi notunu Giriniz:");
		fenBilgisi = scan.nextInt();
		System.out.println("Sosyal Bilgisi notunu Giriniz:");
		sosyalBilgisi = scan.nextInt();
		System.out.println("Beden eðitimi notunu Giriniz:");
		bedenEðitimi = scan.nextInt();
		ortalama =(turkce+fenBilgisi+sosyalBilgisi+bedenEðitimi+matematik)/5;
		System.out.println(ortalama);
		if (ortalama >=50 ) {
			System.out.println("Sýnýfý " + ortalama +" ile geçtiniz");
		}
		else {
			System.out.println(ortalama +  " ile sýnýfta kaldýnýz");
		}
		
		
		

	}

}
