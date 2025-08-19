import java.util.Scanner;
class NeonNumber {
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        int temp = square;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Neon number: ");
        int number = scanner.nextInt();

        if (isNeon(number)) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }
        scanner.close();
    }
}
