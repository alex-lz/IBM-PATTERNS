package creationals.abstract_factory.paymentmethodfactory;

public class Credit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "Pago con credito";
    }
    
}
