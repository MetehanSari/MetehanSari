import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("Ýlk Sayýyý Giriniz:");
		sayi1 = scan.nextInt();
		System.out.println("\n Ýkinci sayýyý girinz:");
		sayi2 = scan.nextInt();
		System.out.println("\n Lütfen yapmak istediðinz iþlemi seçiniz:");
		System.out.println("1Toplama \n 2- Çýkarma \n 3-Çarpma \n 4-Bölme");
		System.out.println("Seçiminiz:");
		secim = scan.nextInt();
		if(secim ==1) {
			System.out.println("Toplama" +(sayi1+sayi2));
		
		}
		else if (secim ==2) {
			System.out.println("Çýkarma:"+ (sayi1-sayi2));
		}
		else if (secim==3) {
			System.out.println("Çarpma"+ (sayi1*sayi2));
		}
		else if(secim ==4){
			if (sayi2==0) {
				System.out.println("Ýkinci sayý 0'a eþittir ve sonuç belirsizdir");
			}
			System.out.println("Bölme:"+ (sayi1/sayi2));
			
		}
		else {
			System.out.println("Geçersiz bir iþlem girdiniz:");
		}
	}

}
