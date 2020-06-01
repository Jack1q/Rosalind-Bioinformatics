import java.util.Scanner;

public class ComplementingaStrandofDNA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] dna = sc.next().toCharArray();
		System.out.println(reverse(complement(dna)));

	}
	public static String complement(char[] seq) {
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == 'C') seq[i] = 'G';
			else if (seq[i] == 'G') seq[i] = 'C';
			else if (seq[i] == 'A') seq[i] = 'T';
			else seq[i] = 'A';
		}
		return new String(seq);
	}

	public static String reverse(String seq) {
		String result = "";
		for (int i = seq.length() - 1; i >= 0; i--) {
			result += seq.substring(i,i+1);
		}
		return result;
	}
}