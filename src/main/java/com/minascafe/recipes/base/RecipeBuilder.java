package com.minascafe.recipes.base;

import java.util.HashSet;
import java.util.Set;

class RecipeBuilder {

    private String name;
    private Set<Ingredient> ingredients;

    RecipeBuilder() {
        ingredients = new HashSet<>();
    }

    RecipeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    RecipeBuilder addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    Recipe build() {
        return new Recipe(name, ingredients);
    }
}
