import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            num=num+numbers[i];
        }
        System.out.println(num);
        System.out.println(num/numbers.length);
    }
}
