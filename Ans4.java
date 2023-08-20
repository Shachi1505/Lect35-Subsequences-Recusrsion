import java.util.Scanner;

public class Ans4 {
    public static void print(String nums, int idx, String ans) {
        if (idx == nums.length()) {
            System.out.println(ans);
            return;
        }

        print(nums, idx + 1, ans + Character.toString(nums.charAt(idx)));
        if (idx != nums.length() - 1) {
            print(nums, idx + 1, ans + Character.toString(nums.charAt(idx)) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        print(nums, 0, " ");
    }
}
