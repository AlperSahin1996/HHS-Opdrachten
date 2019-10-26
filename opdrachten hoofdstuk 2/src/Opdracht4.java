import java.util.Scanner;

public class Opdracht4 {
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

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);
        System.out.println("The distance is: " + distance );
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
