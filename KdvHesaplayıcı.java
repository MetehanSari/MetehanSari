import java.util.Scanner;

public class KdvHesaplayýcý {

	public static void main(String[] args) {
		
		double  tutar , kdvliFiyat;
		double kdv =0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.println("ürünün tutarýný girinz:");
		tutar = input.nextDouble();
		kdvliFiyat = tutar + (tutar*kdv);
		System.out.println(kdvliFiyat);
	}

}
