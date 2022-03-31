package creationals.abstract_factory.paymentmethodfactory;

import creationals.abstract_factory.AbstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod>{

    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)) {
            return new Credit();
        } else if("DEBIT".equals(type)) {
            return new Debit();
        }
        return null;
    }
    
}
