import java.util.*;
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = {
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
        };
        sc.close();

        int count = 0;
        int max = 0;
        int index = 0;

        for (int value : intArray
        ) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}