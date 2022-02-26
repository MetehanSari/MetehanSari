import java.util.Scanner;

public class DaireAlanHacimHesaplama {

	public static void main(String[] args) {
		int r;
		double alan, hacim, pi = 3.14;
		Scanner input = new Scanner (System.in);
		System.out.println("Daire yarý çapýný girinz:\n");
		r = input.nextInt();
		alan = 2* pi*r;
		hacim = pi *(r*r);
		System.out.println("Dairenin Alaný:" +alan);
		System.out.println("Dairenin hacmi:"+hacim);

	}

}
