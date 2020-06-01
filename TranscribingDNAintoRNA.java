import java.util.Scanner;

public class TranscribingDNAintoRNA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] dna = sc.next().toCharArray();
		for (int i = 0; i < dna.length; i++) {
			if (dna[i] == 'T') dna[i] = 'U';
		}
		System.out.print(new String(dna));
	}
}