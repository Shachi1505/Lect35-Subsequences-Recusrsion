import java.util.Scanner;

public class Ans5 {
    public static void print(int remChar, String ans) {
        if (remChar == 0) {
            System.out.println(ans);
            return;
        }
        print(remChar - 1, ans + "-");
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) == "-") {
            print(remChar - 1, ans + "*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        print(k, " ");
    }
}
