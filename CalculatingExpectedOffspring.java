import java.util.*;

public class CalculatingExpectedOffspring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nAA_AA = s.nextInt();
        int nAA_Aa = s.nextInt();
        int nAA_aa = s.nextInt();
        int nAa_Aa = s.nextInt();
        int nAa_aa = s.nextInt();
        int naa_aa = s.nextInt();
        double offspringWithDominantPhenotype = (nAA_AA * 2) + (nAA_Aa * 2) + (nAA_aa * 2) + (nAa_Aa * 2 * 0.75) + (nAa_aa * 2 * 0.50);
        System.out.println(offspringWithDominantPhenotype);
    }
}