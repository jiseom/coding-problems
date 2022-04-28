import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2845V2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoplePerSquareMeter = scanner.nextInt();
        int area = scanner.nextInt();
        scanner.nextLine();
        String estimatedNumberObPeople = scanner.nextLine();
        String[] arr = estimatedNumberObPeople.split(" ");
        int actualNumberOfPeople  = peoplePerSquareMeter * area;

        Integer[] intArr = new Integer[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i])-actualNumberOfPeople;
        }

        String result = Arrays.stream(intArr).map(String::valueOf).collect(Collectors.joining(" "));
        System.out.print(result);


        scanner.close();

    }


}
