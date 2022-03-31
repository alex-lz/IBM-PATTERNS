package creationals.abstract_factory.cardfactory;

public class MasterCard implements Card{

    @Override
    public String getCardNumber() {
        // TODO Auto-generated method stub
        return "2222 5555 9999";
    }

    @Override
    public String getCardType() {
        // TODO Auto-generated method stub
        return "MASTERCARD";
    }
    
}
