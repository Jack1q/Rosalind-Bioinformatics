import java.util.*;

public class RabbitsandRecurrenceRelations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.print(fib(n,k));
	}
	public static long fib(int months, int offspring) {
		long j = 1; // pos 1
		long k = 1; // pos 2
		for (int i = 2; i < months; i++) {
			long temp = k;
			k = j * offspring + k;
			j = temp;
		}
		return k;
	}
}
