package challenges.builder;

public class Pizza {

    // All final attributes
    private final String name; // required
    private final String sauce; // optional
    private final String cheese; // optional
    private final String baser; // optional
    
    private Pizza(PizzaBuilder pizzaBuilder) {
        this.name = pizzaBuilder.name;
        this.sauce = pizzaBuilder.sauce;
        this.cheese = pizzaBuilder.cheese;
        this.baser = pizzaBuilder.baser;
    }

    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public String getBaser() {
        return baser;
    }

    @Override
    public String toString() {
        return "Pizza [baser=" + baser + ", cheese=" + cheese + ", name=" + name + ", sauce=" + sauce + "]";
    }

    public static class PizzaBuilder {

        private final String name;
        private String sauce;
        private String cheese;
        private String baser;

        public PizzaBuilder(String name) {
            this.name = name;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder baser(String baser) {
            this.baser = baser;
            return this;
        }

        //Return the finally consrcuted User object
        public Pizza build() {
            return new Pizza(this);
        }

    }
  
}
