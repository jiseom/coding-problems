import java.util.Scanner;

public class Problem2845V4 {


        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

            int L = scanner.nextInt();
            int P = scanner.nextInt();
            scanner.nextLine();
            String[] news = scanner.nextLine().split(" ");

            int countInArea = L * P;
            String[] result = new String[news.length];
            for (int i = 0; i < news.length; i++) {
                int countInNews = Integer.parseInt(news[i]);
                int count = countInNews - countInArea;

                result[i] = Integer.toString(count);
            }

            System.out.println(String.join(" ", result));

            scanner.close();
        }
    }

