import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi,parola;
		System.out.print("Kullan�c� ad�n� giriniz:");
		k_adi = scan.nextLine();
		System.out.print("Parola Giriniz:");
		parola = scan.nextLine();
		if (k_adi.equals("java")&& parola.equals("123")) {
			System.out.print("Ba�ar�l� bir �ekilde giri� yapt�n�z:");
			
		}
		else  {
			System.out.println("kullan�c� ad� veya parolan�z yanl��");
		}

	}

}
