import java.util.*;
import java.util.Scanner;

public class Ans1 {

    public static void print(int start, String out, int n) {
        if (n == 0) {
            System.out.println(out + " ");
            return;
        }
        for (int i = start; i <= 9; i++) {
            String str = out + Integer.toString(i);
            print(i + 1, str, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        print(0, " ", n);
    }
}