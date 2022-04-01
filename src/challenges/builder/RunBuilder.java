package challenges.builder;

public class RunBuilder {

    public static void main(String[] args) throws Exception {
        
        Pizza pza1 = new Pizza.PizzaBuilder("Extra hot")
        .sauce("Habanero")
        .cheese("Parmesano")
        .base("Harina de garbanzo")
        .build();

        System.out.println(pza1);

        Pizza pza2 = new Pizza.PizzaBuilder("Especial de parmesano")
        // no sauce
        .cheese("Parmesano")
        .base("Harina de almendra")
        .build();

        System.out.println(pza2);

        Pizza pza3 = new Pizza.PizzaBuilder("Familiar")
        // no sauce
        // no cheese
        .base("Harina comun")
        .build();

        System.out.println(pza3);
    }
    
}
