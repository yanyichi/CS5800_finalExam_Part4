package designpattern.proxypattern;

//Users have to access their bank account by access their debit card(Proxy class)
public class DebitCardProxy implements Account{

    private BankAccount bankAccount;
    private String debitCardNumber;

    public DebitCardProxy(String debitCardNumber){
        this.debitCardNumber = debitCardNumber;
    }

    public void checkBankAccountBalance(){
        if(bankAccount == null){
            bankAccount = new BankAccount(this.debitCardNumber);
        }
        System.out.println("Account Balance : " + bankAccount.getAccountBalance());
    }

    @Override
    public void printAccountDetail() {
        if(bankAccount == null){
            bankAccount = new BankAccount(this.debitCardNumber);
        }
        bankAccount.printAccountDetail();
    }
}
