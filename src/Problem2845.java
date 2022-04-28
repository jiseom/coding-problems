import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2845 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participants = scanner.nextInt();
        int area = scanner.nextInt();
        int actualNumberOfPeople = participants * area;
        scanner.nextLine();
        String expectedNumberOfPeople = scanner.nextLine();
        List<Integer> expectedNumbers = Arrays.stream(expectedNumberOfPeople.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String answer = expectedNumbers.stream()
                .map(e -> String.valueOf(e - actualNumberOfPeople))
                .collect(Collectors.joining(" "));
        System.out.println(answer);
        scanner.close();
    }

}
