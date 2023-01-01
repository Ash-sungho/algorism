import java.util.Arrays;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numberArray = new double[sc.nextInt()];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextDouble();
        }
        sc.close();
        Arrays.sort(numberArray);
        double sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += ((numberArray[i] / numberArray[numberArray.length - 1]) * 100);
        }
        System.out.println(sum / numberArray.length);
    }

}
