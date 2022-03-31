package creationals.builder;

public class RunBuilder {

    public static void main(String[] args) throws Exception {
        
        Card visa = new Card.CardBuilder("VISA", "1111 0000 2222 5555")
        .name("Alejandro Loaiza")
        .isCredit(true)
        .build();

        System.out.println(visa);
    }
    
}
