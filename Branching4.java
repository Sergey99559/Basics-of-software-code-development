package modul1;
import java.util.Scanner;

public class Branching4 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("������� ������ ���������: ");
		int A = s.nextInt();
		System.out.print("������� ����� ���������: ");
		int B = s.nextInt();
		System.out.println("������� ������� �������: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		s.close();
		
		if ((A>=x && B>=y) || (A>=y && B>=x)) {
			System.out.println("������ ��������");
		}else if ((A>=x && B>=z) || (A>=z && B>=x)) {
			System.out.println("������ ��������");
		}else if ((A>=y && B>=z) || (A>=z && B>=y)) {
			System.out.println("������ ��������");
		}else {
			System.out.println("������ �� ��������");
		}
	}
}
