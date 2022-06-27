import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("enter 'first number");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.println("enter 'second number");
        int secondNum = input.nextInt();
        int count = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            if (findPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean findPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
