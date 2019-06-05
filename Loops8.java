package modul1;
import java.util.Scanner;

public class Loops8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Введите 2 числа: ");
		int first = s.nextInt();
		int second = s.nextInt();
		s.close();
		
		System.out.print("Первое число состоит из цифр: ");
		while (first > 0) {
			System.out.print(first%10 + " ");
			first /= 10;
		}
		
		System.out.println();
		System.out.print("Второе число состоит из цифр: ");
		while (second > 0) {
			System.out.print(second%10 + " ");
			second /= 10;
		} 
	}
}
