import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int reverse1 = 0;
        int reverse2 = 0;

        reverse1 = getReverse(num1, reverse1);
        reverse2 = getReverse(num2, reverse2);

        System.out.println(reverse1 > reverse2 ? reverse1 : reverse2);
    }
    private static int getReverse(int num1, int reverse) {
        while (num1 != 0) {
            int digit = num1 % 10;
            reverse = reverse * 10 + digit;
            num1 /= 10;
        }
        return reverse;
    }
}
