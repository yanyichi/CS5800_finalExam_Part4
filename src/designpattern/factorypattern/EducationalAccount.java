package designpattern.factorypattern;
// this is EducationalAccount Designer can implement these accounts individually.
public class EducationalAccount implements Account {

    @Override
    public void printAccountType() {
        System.out.println("This is a educational account");
    }
}

