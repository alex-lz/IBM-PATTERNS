package creationals.singleton;

import java.io.Serializable;

// implement Serializable
public class Card implements Serializable{

    private static Card INSTANCE;
    private String cardNumber;

    // private constructor to avoid create instance
    private Card() {

    }

    // use synchronized for more than one person access the method
    public synchronized static Card getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    //
    private Object readResolve() {
        return INSTANCE;
    }

    public static void setINSTANCE(Card iNSTANCE) {
        INSTANCE = iNSTANCE;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    
    
}
