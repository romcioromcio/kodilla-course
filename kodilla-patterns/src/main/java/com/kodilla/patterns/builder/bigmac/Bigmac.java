package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private static final String ROLL = "Roll without sesame";
    private static final String ROLL_WITH_SESAME = "Roll with sesame";

    private static final String SAUCE_STANDARD = "Standard sauce";
    private static final String SAUCE_1000 = "1000 islands sauce";
    private static final String SAUCE_BARBECUE = "Barbecue sauce";

    private static final String SALAT = "Salat";
    private static final String ONION = "Onion";
    private static final String BECON = "Becon";
    private static final String CUCUMBER = "Cucumber";
    private static final String CHILI_PEPPER = "Chili pepper";
    private static final String MUSHROOMS = "Mushrooms";
    private static final String SHRIMP = "Shrimp";
    private static final String CHEESE = "Cheese";

    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            if(roll.equals(ROLL_WITH_SESAME) || roll.equals(ROLL)) {
                this.roll = roll;
            }else {
                throw new IllegalStateException("Incorrect choice! Choose: Roll with sesame or Roll without sesame");
            }
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals(SAUCE_STANDARD) || sauce.equals(SAUCE_BARBECUE) || sauce.equals(SAUCE_1000)) {
                this.sauce = sauce;
            }else {
                throw new IllegalStateException("Incorrect choice! Choose: Standard sauce or 1000 islands sauce or Barbecue sauce");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(checkIngredients(ingredient)) {
                ingredients.add(ingredient);
            }else {
                throw new IllegalStateException("Incorrect choice! Available ingredients are: Salat, Onion, Becon, Cucumber, Chili pepper, Mushrooms, Shrimp and Cheese");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }

        private boolean checkIngredients(String ingredient) {
            boolean check = false;
            List<String> availableIngredients = availableIngredients();
            for(String ing : availableIngredients) {
                if(ing.contains(ingredient)) {
                    check = true;
                }
            }
            return check;
        }

        private List<String> availableIngredients() {
            List<String> ingredientsList = new ArrayList<>();
            ingredientsList.add(SALAT);
            ingredientsList.add(ONION);
            ingredientsList.add(BECON);
            ingredientsList.add(CUCUMBER);
            ingredientsList.add(CHILI_PEPPER);
            ingredientsList.add(MUSHROOMS);
            ingredientsList.add(SHRIMP);
            ingredientsList.add(CHEESE);
            return ingredientsList;
        }
    }

    public String getRoll() {
        return roll;
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

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
