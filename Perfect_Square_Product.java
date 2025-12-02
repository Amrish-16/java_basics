import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long product = N * M;
        long sqrt = (long) Math.sqrt(product);
        if (sqrt * sqrt == product) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
