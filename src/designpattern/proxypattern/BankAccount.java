package designpattern.proxypattern;

//These are bank account with two functions set Account Number and calculate Account Balance
public class BankAccount implements  Account{

    private String accountNumber;
    private String accountBalance;
    private String debitCardNumber;

    public BankAccount(String debitCardNumber){
        this.debitCardNumber = debitCardNumber;
        this.calculateAccountBalance();
        this.setAccountNumber();
    }

    @Override
    public void printAccountDetail() {
        System.out.println("Debit card number is: " + this.debitCardNumber);
    }

    private void setAccountNumber(){
        this.accountNumber = "123456789";
        System.out.println("Account number :" + this.accountNumber);
    }

    private void calculateAccountBalance(){
        this.accountBalance = "1000";
        System.out.println("Account balance :" + this.accountBalance);
    }

    public String getAccountBalance(){
        return this.accountBalance;
    }
}
