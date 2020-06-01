import java.util.Scanner;

public class CountingPointMutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) count++;
        }
        System.out.print(count);
    }
}