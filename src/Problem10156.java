import java.util.Scanner;

public class Problem10156 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        Integer[] a = new Integer[split.length];
        Integer result = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(split[i]);
        }

        int k = a[0];
        int n = a[1];
        int m = a[2];

        result = (k * n) - m;

        if ((k * n) < m) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
        scanner.close();
    }

}
