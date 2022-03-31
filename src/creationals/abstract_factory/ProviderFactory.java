package creationals.abstract_factory;

import creationals.abstract_factory.cardfactory.CardFactory;
import creationals.abstract_factory.paymentmethodfactory.PaymentMethodFactory;

public class ProviderFactory {

    public static AbstractFactory getFactory(String chooseFactory) {

        if("Card".equals(chooseFactory)) {
            return new CardFactory();
        } 
        else if("PaymentMethod".equals(chooseFactory)) {
            return new PaymentMethodFactory();
        }

        return null;
    }
    
}
