//Main class
public class Main {

    //main method
    public static void main (String[] args) {

        // creating a new Account named alexAccount to test the Account class functionality. ClassName.MethodName(userInput)
        Account alexAccount = new Account();

        alexAccount.setCustomerName("Alexander Liu");
        alexAccount.setNumber("00001");
        alexAccount.setBalance(4500.0);
        alexAccount.setCustomerEmail("alex.liu@myemail.com");
        alexAccount.setCustomerPhone("123 456 7890");

        alexAccount.withdrawFunds(100.0);
        alexAccount.depositFunds(250.0);
        alexAccount.withdrawFunds(50.0);
        alexAccount.depositFunds(2000.0);
    }
}
