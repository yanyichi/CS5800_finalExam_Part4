package designpattern.factorypattern;
//this is RetirementAccount Designer can implement these accounts individually.
public class RetirementAccount implements Account{

    @Override
    public void printAccountType() {
        System.out.println("This is a retirement account");
    }
}

