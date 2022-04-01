package creationals.singleton;

public class RunSingleton {

    public static void main(String[] args) {
        
        Card.getINSTANCE().setCardNumber("2222 9087 3356");

        System.out.println("Numero de tarjeta: " + Card.getINSTANCE().getCardNumber() );

    }
    
}
