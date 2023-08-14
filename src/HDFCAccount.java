import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
    private String accountNumber;
    private String password;
    private double balance;

    //default constructor
    public HDFCAccount() {
    }

    //parameterraised constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNumber=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public String getIFCcode() {
        return IFCcode;
    }

    final double rateofinterest=7.1;

    final String IFCcode="HDFC0007";

    @Override
    public String fetchBalance(String password) {

       if(this.password.equals(password)){
           return "Your balance is :"+this.balance;
       } return "Incorrect Password!!!";
    }

    @Override
    public String addMoney(double money) {
        this.balance+=money;
        return "your balance add successfully.new balance is:"+this.balance ;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance < amount){
                return "your balance is not sufficient";
            }
            this.balance-=amount;
            return "your amount detected successfully.new balance is :"+this.balance;
        }
        return "Incorrect password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Your password changed successfully";
        }
        return "your password is incorrect as original password. reenter correct password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year*rateofinterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                ", IFCcode='" + IFCcode + '\'' +
                '}';
    }
}
