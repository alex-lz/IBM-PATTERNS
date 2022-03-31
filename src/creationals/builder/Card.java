package creationals.builder;

public class Card {

    private final String cardType;
    private final String name;
    private final String number;
    private final int expire;
    private final boolean isCredit;

    private Card(CardBuilder cardBuilder) {
        this.cardType = cardBuilder.cardType;
        this.name = cardBuilder.name;
        this.number = cardBuilder.number;
        this.expire = cardBuilder.expire;
        this.isCredit = cardBuilder.isCredit;

    }

    @Override
    public String toString() {
        return "Card [cardType=" + cardType + ", expire=" + expire + ", isCredit=" + isCredit + ", name=" + name
                + ", number=" + number + "]";
    }

    public static class CardBuilder {

        private String cardType;
        private String name;
        private String number;
        private int expire;
        private boolean isCredit;

        public CardBuilder(String cardType, String number){
            this.cardType = cardType;
            this.number = number;
        }

        public CardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CardBuilder expire(int expire) {
            this.expire = expire;
            return this;
        }

        public CardBuilder isCredit(boolean isCredit) {
            this.isCredit = isCredit;
            return this;
        }

        public Card build() {
            return new Card(this);
        }

    }



}