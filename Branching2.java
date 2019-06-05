package modul1;
import java.util.Scanner;

public class Branching2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double d = s.nextDouble();
		s.close();
		
		Branching2 branch = new Branching2();
		branch.maximum(a, b, c ,d);
	}
	
	public void maximum(double a, double b, double c, double d) {
		double min1 = 0; 
		double min2 = 0;
		double max = 0;
		min1 = (a<=b) ? a : b;
		min2 = (c<=d) ? c : d;
		max = (min1>=min2) ? min1 : min2;
		System.out.println(max);
	}
}
