public class Main {
    public static void main(String[] args) {

        HDFCAccount vivek=new HDFCAccount("vivek","thiru",2000.0);

        System.out.println(vivek);

        //fetchbalance
        System.out.println(vivek.fetchBalance("thiru"));//expect output is incorrectpassord
        System.out.println(vivek.fetchBalance("thiru"));//2000

        //addMoney
        System.out.println(vivek.addMoney(100000.00));//youtbalance add1

        //withdrawmoney
        System.out.println(vivek.withdrawMoney(2000000.00,"thiru"));
        System.out.println(vivek.withdrawMoney(100000.00,"thiru"));//yoout amout detected

        //change password
        System.out.println(vivek.changePassword("thi123","thoiru123"));//orginal password is not correct
        System.out.println(vivek.changePassword("thiru","thiru123"));//your password is changed sucessfully

        //calculateinterest

        System.out.println(vivek.calculateInterest(10));

    }
}