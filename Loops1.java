package modul1;
import java.util.Scanner;
public class Loops1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������� �����");
		int x = s.nextInt();
		int sum = 0;
		while (true) {
			if (x<1) {
				System.out.print("������� ����� ������������� �����: ");
				x = s.nextInt();
			}else {
				for (int i = 1; i<=x; i++) {
					sum += i;
				}
				break;
			}
		}
		s.close();
		System.out.println(sum);
	}
}
