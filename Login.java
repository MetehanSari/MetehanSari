import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi,parola;
		System.out.print("Kullanýcý adýný giriniz:");
		k_adi = scan.nextLine();
		System.out.print("Parola Giriniz:");
		parola = scan.nextLine();
		if (k_adi.equals("java")&& parola.equals("123")) {
			System.out.print("Baþarýlý bir þekilde giriþ yaptýnýz:");
			
		}
		else  {
			System.out.println("kullanýcý adý veya parolanýz yanlýþ");
		}

	}

}
