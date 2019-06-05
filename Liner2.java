package modul1;

import java.util.Scanner;

public class Liner2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		
		Liner2 lin = new Liner2();
		lin.result(a, b, c);
	}
	
	public void result(double a, double b, double c){
		double z = (b + Math.sqrt(b*b + 4*a*c))/2*a - Math.pow(a, 3)*c + Math.pow(b, -2);
		System.out.println(z);
	}
}
