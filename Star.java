import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int index = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count-index-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            index++;
        }


    }
}
