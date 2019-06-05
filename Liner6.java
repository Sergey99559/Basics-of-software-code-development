package modul1;
import java.util.Scanner;

public class Liner6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("¬ведите x: ");
		double x = s.nextDouble();
		System.out.print("¬ведите y: ");
		double y = s.nextDouble();
		s.close();
		
		Liner6 lin = new Liner6();
		lin.answer(x, y);
	}
	
	public void answer(double x, double y) {
		boolean top_area = false;
		boolean bottom_area = false;
		
		if ((x>=-4 && x<=4) && (y>=-3 && y<=0)) top_area = true;
		if ((x>=-2 && x<=2) && (y>=0 && y<=4)) bottom_area = true;
		
		if (top_area || bottom_area) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
