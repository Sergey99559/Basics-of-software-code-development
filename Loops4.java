package modul1;
import java.math.BigInteger;

public class Loops4 {
	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i<=200; i++) {
			result = result.multiply(BigInteger.valueOf(i*i));
		}
		System.out.println(result);
	}
}
