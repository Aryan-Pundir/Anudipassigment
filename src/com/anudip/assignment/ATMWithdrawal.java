import java.util.Scanner;

public class ATMWithdrawal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = "1234";
        double money = 5000;
        System.out.println("enter the atm pin: ");
        String atmpin = sc.nextLine();
        if (pin.equals(atmpin)){
            System.out.println("Correct pin: ");
            System.out.println("Withrdawl is proceeding : ");
            System.out.println("enter amount: ");
           double amount = sc.nextDouble();
            if (amount>0 && amount<=money){
                System.out.println("transcation is done : ");
             double   ruppe = money - amount;
                System.out.println(" Amount remaining : " + ruppe);
            } else {
                System.out.println(" insufficent balance: ");
            }
        }else {
            System.out.println(" Atm pin is invalid or try again: ");
        }
    }
}
