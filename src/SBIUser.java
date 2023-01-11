import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    //attributes
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;


    //constructor
    public SBIUser(String name, double balance, String password) {
        //created by us
        this.name = name;
        this.balance = balance;
        this.password = password;

        //bank is initialising
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());//generates unique id everytime
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Your new Balance is: "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
       if(Objects.equals(enteredPassword,password)){//checking the entered password with the account paassword
           if(amount>balance){
               return "Insufficient Money";
           }
           else{
               balance = balance - amount;
               return "Money debited Successfully";
           }
       }
       else {
           return "Wrong password !";
       }
    }

    @Override
    public double calculateInterest(int years) {
        return  (balance*years*rateOfInterest)/100;
    }
}
