package modul1;
import java.util.Scanner;

public class Branching5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		s.close();
		
		Branching5 b = new Branching5();
		b.result(x);
	}
	
	public void result(double x) {
		double F = 0;
		if (x <= 3) {
			F = x*x - 3*x + 9;
			System.out.println(F);
		}else {
			F = 1/(Math.pow(x, 3) + 6);
			System.out.println(F);
		}
	}
}
