import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("�lk Say�y� Giriniz:");
		sayi1 = scan.nextInt();
		System.out.println("\n �kinci say�y� girinz:");
		sayi2 = scan.nextInt();
		System.out.println("\n L�tfen yapmak istedi�inz i�lemi se�iniz:");
		System.out.println("1Toplama \n 2- ��karma \n 3-�arpma \n 4-B�lme");
		System.out.println("Se�iminiz:");
		secim = scan.nextInt();
		if(secim ==1) {
			System.out.println("Toplama" +(sayi1+sayi2));
		
		}
		else if (secim ==2) {
			System.out.println("��karma:"+ (sayi1-sayi2));
		}
		else if (secim==3) {
			System.out.println("�arpma"+ (sayi1*sayi2));
		}
		else if(secim ==4){
			if (sayi2==0) {
				System.out.println("�kinci say� 0'a e�ittir ve sonu� belirsizdir");
			}
			System.out.println("B�lme:"+ (sayi1/sayi2));
			
		}
		else {
			System.out.println("Ge�ersiz bir i�lem girdiniz:");
		}
	}

}
