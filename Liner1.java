package modul1;
import java.util.Scanner;

public class Liner1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		Liner1 l = new Liner1();
		l.result(a, b, c);
	}
	public void result(int a, int b, int c) {
		float z = ((a-3)*b/2)+c;
		System.out.println(z);
	}

}
