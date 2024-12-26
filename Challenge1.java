import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers integers : ");

        for(int i = 0; i < 5; ++i) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nThe numbers in reverse order are : ");

        for(int i = 4; i >= 0; --i) {
            System.out.println(numbers[i]);
        }
    }
}
