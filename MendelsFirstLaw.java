import java.util.Scanner;
public class MendelsFirstLaw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int homozygousDominant = s.nextInt();
        int heterozygous = s.nextInt();
        int homozygousRecessive = s.nextInt();
        double total = homozygousDominant + heterozygous+ homozygousRecessive;
        double probability = 1.0 - ((heterozygous / total) * ((heterozygous - 1) / (total - 1)) * (0.25) 
        	+ (heterozygous/ total) * (homozygousRecessive / (total - 1)) * (0.5) 
        	+ (homozygousRecessive / total) * (heterozygous / (total - 1)) * (0.5) 
        	+ (homozygousRecessive / total) * ((homozygousRecessive - 1) / (total - 1)));
        System.out.println(probability);
    }
}