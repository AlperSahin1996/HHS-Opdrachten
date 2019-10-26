import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        double oppervlakte = height * width;
        double omtrek = (width + height) * 2;
        double diagonaal = Math.sqrt(Math.pow(height, 2) + Math.pow(width,2));

        System.out.println("oppervlakte is: " + oppervlakte);
        System.out.println("omtrek is: " + omtrek);
        System.out.println("diagonaal is: " + diagonaal);

    }
}
