public interface BankAccountInterface {
     String fetchBalance(String password);
    String addMoney(double money);
    String withdrawMoney(double amount,String password);
    String changePassword(String oldpassword,String newpassword);
   double calculateInterest(int year);




}
