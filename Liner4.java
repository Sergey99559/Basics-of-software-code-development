package modul1;
import java.util.Scanner;

public class Liner4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("¬ведите число: ");
		double numb = s.nextDouble();
		s.close();
		
		int x = (int)numb;
		double y = (numb*1000)%1000;
		double result = y + ((double)x/1000);
		System.out.println(result);
	}

}
