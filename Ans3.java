import java.util.Scanner;

public class Ans3 {
    public static void print(Character[] ch, int remainCh, String ans) {
        if (remainCh == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            print(ch, remainCh - 1, ans + Character.toString(ch[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of set n");
        int n = sc.nextInt();

        Character[] ch = new Character[n];
        System.out.println("Enter n characters of set");
        for (int i = 0; i < n; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("Enter length of string k");
        int k = sc.nextInt();
        print(ch, k, " ");
    }
}
