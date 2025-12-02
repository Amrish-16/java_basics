import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n <= 1) {
            System.out.println("no");
            return;
        }
        boolean composite = false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                composite = true;
                break;
            }
        }
        System.out.println(composite ? "yes" : "no");
    }
}
