package designpattern.strategypattern;
//There is example of HighFrequency investment strategy option for the user, programmer could implement suitable function unit here.
public class HighFrequencyTradeInvestmentStrategy implements InvestmentStrategy {

    @Override
    public void suggestInvestmentStrategy() {
        System.out.println("Sorry!!!! No suggestion for high frequency trading");
    }
}
