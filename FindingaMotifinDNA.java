import java.util.*;

public class FindingaMotifinDNA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String seq = s.next();
        String sub = s.next();
        for (int i = 0; i < seq.length() - sub.length(); i++) {
            if (seq.substring(i,i+sub.length()).equals(sub)) {
                System.out.print((1+i) + " ");
            }
        }
    } 
}