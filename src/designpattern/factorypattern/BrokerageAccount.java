package designpattern.factorypattern;
//this is BrokerageAccount. Designer can implement these accounts individually.
public class BrokerageAccount implements  Account{
    @Override
    public void printAccountType() {
        System.out.println("This is a brokerage account");
    }

}
