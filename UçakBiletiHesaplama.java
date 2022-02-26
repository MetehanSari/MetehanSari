import java.util.Scanner;

public class UçakBiletiHesaplama {

	public static void main(String[] args) {
		//km birim fiyatý :0.10$
		//12 yaþýndan küçükse toplam fiyata %50 indirim
		//12 ve 24 arasýndaysa %10 indirim
		//65 yaþýndan büyükse %30 indirim
		//gidiþ dönüþ alýrsa %20 indirim
		Scanner scan = new Scanner(System.in);
		int km ,yas ,tip;
		System.out.println("Mesafeyi Giriniz:");
		km = scan.nextInt();
		System.out.println("Yaþýnýzý Giriniz:");
		yas = scan.nextInt();
		System.out.println("Yolculuk tipinizi seçiniz(1-Tek Gidiþ , 2 Gidiþ Dönüþ)");
		tip = scan.nextInt();
		
		double normalFiyat,yasÝndirimi,tipIndirimi;
		if (km >0 && yas > 0 && (tip==1 || tip==2)) {
		 normalFiyat = km *0.10;
		 if (yas < 12 ) {
			 yasÝndirimi = normalFiyat*0.5;	//Ýndirim oranýný hesapladýk
			 		 }
		 else if (yas >=12 &&  yas <=24) {
			 yasÝndirimi = normalFiyat *0.10;
			 		 }
		 else if (yas >=65) {
			 yasÝndirimi = normalFiyat *0.30;
			 		 }
		 else {
			 yasÝndirimi = 0;
		 }
		 normalFiyat = normalFiyat - yasÝndirimi;//else if bloklarýnýn hepsinde olduðu için kod kalabiliðini azaltmak için dýþarýda yazýyoruz
		 if (tip == 2) {
				tipIndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat-tipIndirimi) * 2;
			}
		 System.out.println("Bilet Tutarý" + normalFiyat);
		}
		else {
			System.out.println("Girdiler Yanlýþ:");
		}

	}

}
