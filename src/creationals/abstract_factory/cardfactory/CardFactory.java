package creationals.abstract_factory.cardfactory;

import creationals.abstract_factory.AbstractFactory;

public class CardFactory implements AbstractFactory<Card>{

    @Override
    public Card create(String type) {
        if("VISA".equals(type)) {
            return new Visa();
        } else if("MASTERCARD".equals(type)) {
            return new MasterCard();
        }
        return null;
    }

    
}
