import java.util.*;

class ATM {
    float Balance;
    int Pin = 1818;

    public void checkPin(){
        System.out.println("Enter your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if(enterPin == Pin){
            menu();
        }else{
            System.out.println("SORRY! The Entered PIN is incorrect.Please enter a valid PIN");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Enter your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }

        else if(opt == 2){
            withdrawMoney();
        }

        else if(opt == 3){
            depositMoney();
        }

        else if(opt == 4){
            System.out.println("THANKS YOU. VISIT AGAIN.....");
            return;
        }
        else{
            System.out.println("Enter a valid Choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to WithDraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount > Balance) {
            System.out.println("Insufficient Balance");
        }else{
            Balance = Balance - amount;
            System.out.println("Money WithDrawl Successful");
        }

        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}
public class ATM_Machine{
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();


    }
}
