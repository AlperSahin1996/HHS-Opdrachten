import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int first = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int second = scanner.nextInt();

        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        int average = sum / 2;
        int distance = Math.abs(difference);
        int min = Math.min(first, second);
        int max = Math.max(first, second);

        System.out.printf("The sum is: %5d\n", sum);
        System.out.printf("The difference is: %5d\n", difference);
        System.out.printf("The product is: %5d\n", product);
        System.out.printf("The average is: " + average);
        System.out.printf("The distance is: " + distance );
        System.out.printf("The min is: " + min);
        System.out.printf("The max is: " + max);
    }
}
