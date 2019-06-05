package modul1;
import java.util.Scanner;

public class Loops5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("¬ведите число: ");
		double e = s.nextDouble();
		
		System.out.print("¬ведите число членов: ");
		int n = s.nextInt();
		s.close();
		
		double sum = 0;
		
		for (int i = 1; i<=n; i++) {
			double a = 1/Math.pow(2, i) + 1/Math.pow(3, i);
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

}
