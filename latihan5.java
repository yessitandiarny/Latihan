import java.util.Scanner;
public class latihan5 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int x;
		System.out.print("Masukkan nilai : ");
		x = input.nextInt();
		
		if (x >= 0) {
			System.out.println("Nilai bernilai positif");
		} else {
			System.out.println("Nilai bernilai negatif");
		}
	}
}