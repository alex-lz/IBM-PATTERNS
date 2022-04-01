package challenges.builder;

public class Pizza {

    // All final attributes
    private final String name; // required
    private final String sauce; // optional
    private final String cheese; // optional
    private final String base; // optional
    
    private Pizza(PizzaBuilder pizzaBuilder) {
        this.name = pizzaBuilder.name;
        this.sauce = pizzaBuilder.sauce;
        this.cheese = pizzaBuilder.cheese;
        this.base = pizzaBuilder.base;
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

    public String getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Pizza [name=" + name + ", base=" + base + ", cheese=" + cheese + ", sauce=" + sauce + "]";
    }

    public static class PizzaBuilder {

        private final String name;
        private String sauce;
        private String cheese;
        private String base;

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

        public PizzaBuilder base(String base) {
            this.base = base;
            return this;
        }

        // Return the finally consrcuted Pizza object
        public Pizza build() {
            return new Pizza(this);
        }

    }
  
}
