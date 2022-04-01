package estructurales.adpter;

public class CreditCard implements Payment{

    Adapter adapter;

    public CreditCard() {}

    @Override
    public void pay(String type) {
        if("classic".equals(type)) {
            System.out.println("Tarjeta classic: Pagando sin ningun tipo de seguridad");
        }
        else if("gold".equals(type)) {
            adapter = new Adapter(type);
            adapter.pay(type);
        }
        else if("black".equals(type)) {
            adapter = new Adapter(type);
            adapter.pay(type);
        }
        else {
            System.out.println("No se puede hacer el pago, no se reconoce la tarjeta");
        }
        
    }
    
}
