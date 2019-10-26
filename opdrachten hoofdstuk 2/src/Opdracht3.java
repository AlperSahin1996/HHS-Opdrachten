import javax.swing.*;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double cube = number * number * number;
        double fourth = Math.pow(number, 4);

        System.out.println("Square of number is: " + square);
        System.out.println("Cube of number is: " + cube);
        System.out.println("Fourth of number is: " + fourth);

    }
}
