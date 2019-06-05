package modul1;
import java.util.Scanner;

public class Branching3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Задайте координаты первой точки: ");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		
		System.out.print("Задайте координаты второй точки: ");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		System.out.print("Задайте координаты третьей  точки: ");
		int x3 = s.nextInt();
		int y3 = s.nextInt();
		s.close();
		
		if ((x1 - x3)*(y2 - y3)==(x2 - x3)*(y1 - y3)) {
			System.out.println("Точки расположены на одной прямой.");
		}else {
			System.out.println("Точки не расположены на одной прямой.");
		}
	}

}
