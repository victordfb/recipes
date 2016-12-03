package com.minascafe.recipes;

class Ingredient {

    private final String name;
    private final Fraction amount;

    Ingredient(String name, Fraction amount) {
        this.name = name;
        this.amount = amount;
    }

    Fraction getAmount() {
        return amount;
    }

    String getName() {
        return name;
    }
}
