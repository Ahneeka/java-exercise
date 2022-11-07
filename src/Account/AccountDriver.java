package Account;

public class AccountDriver {
    public static void main(String[] args) {
        // Give three intance of an account
        Account myAccount = new Account("Kahane", 30000, "st12357886");
        Account account = new Account("Rahim", 30000, "dye1234567");
        Account ourAccount = new Account("Catalina", 20000, "sfg123684");

        myAccountDetails(ourAccount);
        ourAccount.deposit(2000);
        ourAccount.withdraw(1000);

        myAccountDetails(ourAccount);

        myAccountDetails(account);
        account.deposit(1000);
        account.withdraw(2000);
        myAccountDetails(account);
    }


        public static void myAccountDetails(Account myAccount){
            System.out.println();
            System.out.println("Name "+ myAccount.getName());
            System.out.println("accountBalance "+ myAccount.getAccountBalance());
            System.out.println("accountNumber "+ myAccount.getAccountNumber());


    }
}