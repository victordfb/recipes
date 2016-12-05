package com.minascafe.recipes.coffee;

import com.minascafe.recipes.base.Ingredient;
import com.minascafe.recipes.base.Recipe;

import java.util.Set;

public class CoffeeRecipe {

    private Integer cups;
    private Recipe recipe;

    CoffeeRecipe(String name, Set<Ingredient> ingredients, int cups) {
        this.cups = cups;
        this.recipe = new Recipe(name, ingredients);
    }

    public Integer getCups() {
        return cups;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
