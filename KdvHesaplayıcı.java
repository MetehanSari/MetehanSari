import java.util.Scanner;

public class KdvHesaplay�c� {

	public static void main(String[] args) {
		
		double  tutar , kdvliFiyat;
		double kdv =0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�r�n�n tutar�n� girinz:");
		tutar = input.nextDouble();
		kdvliFiyat = tutar + (tutar*kdv);
		System.out.println(kdvliFiyat);
	}

}
