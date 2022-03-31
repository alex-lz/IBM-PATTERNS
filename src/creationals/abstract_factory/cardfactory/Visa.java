package creationals.abstract_factory.cardfactory;

public class Visa implements Card {

    @Override
    public String getCardNumber() {
        // TODO Auto-generated method stub
        return "4444 3333 7777";
    }

    @Override
    public String getCardType() {
        // TODO Auto-generated method stub
        return "VISA";
    }
    
}
