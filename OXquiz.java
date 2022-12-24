import java.util.Scanner;

public class OXquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {

            String inputString = sc.next();

            int score = 0;
            int result = 0;

            for (int j = 0; j < inputString.length(); j++) {
                if (inputString.charAt(j) == 'O') {
                    score++;
                    result = result + score;
                } else {
                    score = 0;
                }
            }
            System.out.println(result);
        }
            sc.close();
    }
}
