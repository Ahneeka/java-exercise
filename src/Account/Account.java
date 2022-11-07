package Account;

public class Account {
  private String name;
  private double accountBalance;
  private String accountNumber;

  public Account(String name, double accountBalance, String accountNumber ) {
      this.name = name;
      this.accountBalance = accountBalance;
      this.accountNumber = accountNumber;
  }
  public void setName(String name){
      this.name = name;
  }
  public String getName(){
      return name;
  }

  public void setAccountBalance(double accountBalance){
      this.accountBalance = accountBalance;
  }
  public double getAccountBalance() {
      return accountBalance;
  }

  public void setAccountNumber(String accountNumber){
      this.accountNumber = accountNumber;
  }
  public String getAccountNumber(){
      return accountNumber;
  }

  public void deposit(double depositAmount ){
      this.accountBalance = accountBalance + depositAmount;
  }

  public void withdraw(double withdrawalAmount){
      this.accountBalance = accountBalance - withdrawalAmount;
  }

}
