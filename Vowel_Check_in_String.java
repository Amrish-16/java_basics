import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean hasVowel = false;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }
        if (hasVowel)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}
