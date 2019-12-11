package designpattern.strategypattern;
//There is example of Retirement investment strategy option for the user, programmer could implement suitable function unit here.
public class RetirementInvestmentStrategy implements InvestmentStrategy {

    @Override
    public void suggestInvestmentStrategy() {
        System.out.println("You should avoid stocks");
    }
}
