package com.minascafe.recipes.coffee;

import com.minascafe.recipes.base.Ingredient;

import java.util.HashSet;
import java.util.Set;

class CoffeeRecipeBuilder {

    private String name;
    private Set<Ingredient> ingredients;
    private int cups;

    CoffeeRecipeBuilder() {
        this.ingredients = new HashSet<>();
    }

    CoffeeRecipeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    CoffeeRecipeBuilder addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    CoffeeRecipeBuilder makesCups(int cups) {
        this.cups = cups;
        return this;
    }

    CoffeeRecipe build() {
        return new CoffeeRecipe(name, ingredients, cups);
    }
}
