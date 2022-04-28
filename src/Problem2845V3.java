import java.util.Scanner;

public class Problem2845V3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoplePerSquareMeter = scanner.nextInt();
        int area = scanner.nextInt();
        scanner.nextLine();
        String estimatedNumberObPeople = scanner.nextLine();
        String[] arr = estimatedNumberObPeople.split(" ");
        int actualNumberOfPeople = peoplePerSquareMeter * area;

        Integer[] intArr = new Integer[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]) - actualNumberOfPeople;
        }

        String result = new String();
        for (int i = 0; i < intArr.length; i++) {
            result += intArr[i]+ " ";
        }
        System.out.println(result);
        scanner.close();
    }
}

