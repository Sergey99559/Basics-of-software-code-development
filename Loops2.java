package modul1;
import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������� ������ �������: ");
		double a = s.nextDouble();
		
		System.out.println("������� ����� �������: ");
		double b = s.nextDouble();
		
		System.out.println("������� ���: ");
		double h = s.nextDouble();
		s.close();
		
		for (double i = a; i<=b; i = i + h) {
			if ((i > 2) || (i == 0)) {
				System.out.println(i);
			}else {
				System.out.println(-i);
			}
		}
			
	}

}
