import java.util.Scanner;

public class CountingDNANucleotides {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] dnaSequence = sc.next().toCharArray();
		int a = 0;
		int c = 0;
		int g = 0;
		int t = 0;
		for (int i = 0; i < dnaSequence.length; i++) {
			if (dnaSequence[i] == 'A') a++;
			else if (dnaSequence[i] == 'C') c++;
			else if (dnaSequence[i] == 'G') g++;
			else t++;
		}
		System.out.print(a + " " + c + " " + g + " " + t);
	}
}