package creationals.prototype;

public class RunPrototype {

    public static void main(String[] args) {

        PrototypeFactory.loadCards();

        try {
            PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.cardType.VISA);
            visa.getCard();
            PrototypeCard amex = PrototypeFactory.getInstance(PrototypeFactory.cardType.AMEX);
            amex.getCard();
        } 
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    
}
