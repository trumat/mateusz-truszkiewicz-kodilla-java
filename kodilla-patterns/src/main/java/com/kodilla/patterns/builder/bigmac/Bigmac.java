package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    public static final String SESAME_BUN = "Sesame bun";
    public static final String PLAIN_BUN = "Plain bun";
    public static final String STANDARD_SAUCE = "Standard sauce";
    public static final String THOUSAND_ISLAND_SAUCE = "1000 island sauce";
    public static final String BARBECUE_SAUCE = "Barbecue sauce";
    public static final String LETTUCE = "lettuce";
    public static final String ONION = "onion";
    public static final String BACON = "bacon";
    public static final String PICKLES = "pickles";
    public static final String CHILI_PEPPERS = "chili peppers";
    public static final String MUSHROOMS = "mushrooms";
    public static final String SHRIMP = "shrimp";
    public static final String CHEESE = "cheese";
    public static final String[] INGREDIENTS = {LETTUCE, ONION, BACON, PICKLES, CHILI_PEPPERS, MUSHROOMS, SHRIMP, CHEESE};

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (!(bun == Bigmac.PLAIN_BUN || bun == Bigmac.SESAME_BUN)) {
                throw new IllegalStateException("Incorrect bun type");
            } else {
                this.bun = bun;
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if(burgers < 0) {
                throw new IllegalStateException("Number of burgers cannot be negative");
            } else {
                this.burgers = burgers;
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (!(sauce == Bigmac.BARBECUE_SAUCE || sauce == Bigmac.STANDARD_SAUCE || sauce == Bigmac.THOUSAND_ISLAND_SAUCE)) {
                throw new IllegalStateException("Incorrect sauce type");
            } else {
                this.sauce = sauce;
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (!(Arrays.asList(Bigmac.INGREDIENTS).contains(ingredient))) {
                throw new IllegalStateException("Incorrect ingredient");
            } else {
                this.ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
