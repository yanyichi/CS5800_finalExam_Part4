package designpattern.proxypattern;

//Proxy pattern avoids duplication of objects so we create object only once in Main
public class DebitCardProxyTest {
    public static void main(String[] args) {
        //Proxy pattern avoids duplication of objects
        DebitCardProxy debitCard = new DebitCardProxy("111111111");
        System.out.println();
        debitCard.printAccountDetail();
        debitCard.checkBankAccountBalance();
    }
}
