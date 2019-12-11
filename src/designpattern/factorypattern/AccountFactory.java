package designpattern.factorypattern;

/*
Account factory for three type of account
 */

public class AccountFactory {

    public Account createAccount(AccountType accountType){
        switch (accountType) {
            case BROKERAGE:
                return new BrokerageAccount();
            case RETIREMENT:
                return new RetirementAccount();
            case EDUCATIONAL:
                return new EducationalAccount();
        }
        return null;
    }
}
