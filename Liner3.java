package modul1;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner; 

public class Liner3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		double y = s.nextDouble();
		s.close();
		
		Liner3 lin = new Liner3();
		lin.result(x, y);
	}
	
	public void result(double x, double y) {
		double z = (sin(x) + cos(y))/(cos(x) - sin(y))*tan(x*y);
		System.out.println(z);
	}
}
