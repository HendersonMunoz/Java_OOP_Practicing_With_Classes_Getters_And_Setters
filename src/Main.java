//Main class
public class Main {

    //main method
    public static void main (String[] args) {

        //  Calling the Account Class and giving the Account constructor the required parameters.
        Account alexAccount = new Account("00001", 4500.0, "Alexander Liu", "alex.liu@myemail.com", "123 456 7890");

        // Commenting out the code below, since it got replaced by the cons
        // alexAccount.setCustomerName("Alexander Liu");
        // alexAccount.setNumber("00001");
        // alexAccount.setBalance(4500.0);
        // alexAccount.setCustomerEmail("alex.liu@myemail.com");
        // alexAccount.setCustomerPhone("123 456 7890");

        alexAccount.withdrawFunds(100.0);
        alexAccount.depositFunds(250.0);
        alexAccount.withdrawFunds(50.0);
        alexAccount.depositFunds(2000.0);
    }
}
