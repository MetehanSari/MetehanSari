import java.util.Scanner;

public class U�akBiletiHesaplama {

	public static void main(String[] args) {
		//km birim fiyat� :0.10$
		//12 ya��ndan k���kse toplam fiyata %50 indirim
		//12 ve 24 aras�ndaysa %10 indirim
		//65 ya��ndan b�y�kse %30 indirim
		//gidi� d�n�� al�rsa %20 indirim
		Scanner scan = new Scanner(System.in);
		int km ,yas ,tip;
		System.out.println("Mesafeyi Giriniz:");
		km = scan.nextInt();
		System.out.println("Ya��n�z� Giriniz:");
		yas = scan.nextInt();
		System.out.println("Yolculuk tipinizi se�iniz(1-Tek Gidi� , 2 Gidi� D�n��)");
		tip = scan.nextInt();
		
		double normalFiyat,yas�ndirimi,tipIndirimi;
		if (km >0 && yas > 0 && (tip==1 || tip==2)) {
		 normalFiyat = km *0.10;
		 if (yas < 12 ) {
			 yas�ndirimi = normalFiyat*0.5;	//�ndirim oran�n� hesaplad�k
			 		 }
		 else if (yas >=12 &&  yas <=24) {
			 yas�ndirimi = normalFiyat *0.10;
			 		 }
		 else if (yas >=65) {
			 yas�ndirimi = normalFiyat *0.30;
			 		 }
		 else {
			 yas�ndirimi = 0;
		 }
		 normalFiyat = normalFiyat - yas�ndirimi;//else if bloklar�n�n hepsinde oldu�u i�in kod kalabili�ini azaltmak i�in d��ar�da yaz�yoruz
		 if (tip == 2) {
				tipIndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat-tipIndirimi) * 2;
			}
		 System.out.println("Bilet Tutar�" + normalFiyat);
		}
		else {
			System.out.println("Girdiler Yanl��:");
		}

	}

}
