package designpattern.strategypattern;
//There is example of Education investment strategy option for the user, programmer could implement suitable function unit here.
public class EducationInvestmentStrategy implements InvestmentStrategy {

    @Override
    public void suggestInvestmentStrategy() {
        System.out.println("Considering 20% of stock in your portfolio");
    }
}
