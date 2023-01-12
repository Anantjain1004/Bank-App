import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //creating a user
        System.out.println("Enter your name, password,balance to create an account");
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name,balance,password);

        //add amount
        System.out.println("Add money");
        int amount = sc.nextInt();
        String message = user.addMoney(amount);
        System.out.println(message);

        //withDraw money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //check balance
        System.out.println("Remaining Balance: " + user.checkBalance());

        //rate of interest
//        System.out.println("Rate of Interest: " + user.calculateInterest(10));
        System.out.println("Rate of Interest: " + user.calculateInterest(10));



    }
}