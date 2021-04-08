import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Principal Amount: ");
        Double principal = scanner.nextDouble();
        System.out.print("Rate: ");
        Float rate= scanner.nextFloat();
        System.out.print("Duration: ");
        Float duration= scanner.nextFloat();

        MortgageCalculator calculator= new MortgageCalculator(principal,rate,duration);
        System.out.println(calculator.calcMortgage());
    }
}
