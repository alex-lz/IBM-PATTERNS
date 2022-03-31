package creationals.abstract_factory.paymentmethodfactory;

public class Debit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "Pago con debito";
    }
    
}
