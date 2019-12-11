package designpattern.strategypattern;
//Determiner class receives commands and transmits to different Strategy as a parser
public class InvestmentStrategyDeterminer {
    private InvestmentStrategy investmentStrategy;

    public InvestmentStrategyDeterminer(InvestmentStrategy  investmentStrategy){
        this.investmentStrategy = investmentStrategy;
    }

    public void suggestInvestmentStrategy(){
        investmentStrategy.suggestInvestmentStrategy();
    }
}
