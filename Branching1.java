package modul1;
import java.util.Scanner;

public class Branching1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double angle1 = s.nextDouble();
		double angle2 = s.nextDouble();
		s.close();
		
		Branching1 b = new Branching1();
		b.answer(angle1, angle2);
	}
	
	public void answer(double angle1, double angle2) {
		if ((angle1 + angle2) == 90) {
			System.out.println("Прямоугольный треугольник");
		}else if((angle1 + angle2) < 180) {
			System.out.println("Треугольник существует.");
		}else {
			System.out.println("Треугольник не существует.");
		}
	}
}
