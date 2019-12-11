package designpattern.factorypattern;
//Main function creates an object which can be any sub-type in the factory class.
public class AccountFactoryTest {

    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account brokerageAccount = accountFactory.createAccount(AccountType.BROKERAGE);
        Account retirementAccount = accountFactory.createAccount(AccountType.RETIREMENT);
        Account educationalAccount = accountFactory.createAccount(AccountType.EDUCATIONAL);

        brokerageAccount.printAccountType();
        retirementAccount.printAccountType();
        educationalAccount.printAccountType();
    }
}
