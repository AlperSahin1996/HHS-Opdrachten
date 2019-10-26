import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final double MILLIMETERS_PER_INCH  = 25.4;

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        double height2 = MILLIMETERS_PER_INCH * height;

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        double width2 = MILLIMETERS_PER_INCH * width;

        System.out.println("Dimension of the letter is: ");
        System.out.printf("%.2f - height \n", height2);
        System.out.printf("%.2f - width \n", width2);




    }
}
