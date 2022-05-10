import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int[] x = new int[5];
        int res = 0;

        System.out.println("Introduce cinco números: ");
        for (int i = 0; i < x.length; i++) {
            Scanner sc = new Scanner(System.in);
            x[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            res += x[i];
        }

        System.out.println(res);
    }

}