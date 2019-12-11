package designpattern.strategypattern;
//The main function decides which strategy users will use and let Determiner class know.
public class InvestmentStrategyTest {
    public static void main(String[] args) {
        InvestmentStrategyDeterminer educationInvestmentStrategy =
                new InvestmentStrategyDeterminer(new EducationInvestmentStrategy());
        InvestmentStrategyDeterminer highFrequencyTradeInvestmentStrategy =
                new InvestmentStrategyDeterminer(new HighFrequencyTradeInvestmentStrategy());
        InvestmentStrategyDeterminer retirementInvestmentStrategy =
                new InvestmentStrategyDeterminer(new RetirementInvestmentStrategy());

        educationInvestmentStrategy.suggestInvestmentStrategy();
        highFrequencyTradeInvestmentStrategy.suggestInvestmentStrategy();
        retirementInvestmentStrategy.suggestInvestmentStrategy();
    }
}
