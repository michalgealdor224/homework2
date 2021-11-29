import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        largerThanAverage();
    }
    public static void largerThanAverage() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        float sum = 0;
        float avg;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number");
            int number = scanner.nextInt();
            arr[i] = number;
            sum = sum + number;
        }
        avg = sum / arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > avg) {
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

