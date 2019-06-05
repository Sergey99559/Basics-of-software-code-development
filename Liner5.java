package modul1;
import java.util.Scanner;

public class Liner5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int time = s.nextInt();
		s.close();
		
		Liner5 lin = new Liner5();
		lin.convert(time);
	}
	
	public void convert(int time){
		int hours = (int)time/3600;
		int mins = (int)(time/60 - hours*60);
		int sec = (int)(time - hours*3600 - mins*60);
		System.out.format("%d÷ %dìèí %dñ.%n", hours, mins, sec);
	}
	
}

