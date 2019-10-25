public class Opdracht4 {
    public static void main(String[] args){

        double balance = 1000.00;
        int year = 0;

        for (int a = 1; a <= 3; a++){
            balance = balance * 1.05;
            year++;
            System.out.println("Balance of the account in year: " + year + " is : $" + balance);
        }
    }
}
