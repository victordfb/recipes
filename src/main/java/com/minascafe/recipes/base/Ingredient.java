package com.minascafe.recipes.base;

import java.util.Objects;

public class Ingredient {

    private final String name;
    private final Fraction amount;

    public Ingredient(String name, Fraction amount) {
        this.name = name;
        this.amount = amount;
    }

    Fraction getAmount() {
        return amount;
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
