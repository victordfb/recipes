package com.minascafe.recipes.base;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Recipe {

    private final String name;
    private final Set<Ingredient> ingredients;

    Recipe(String name, Set<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    String getName() {
        return name;
    }

    Set<Ingredient> getIngredients() {
        return new HashSet<>(ingredients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name) &&
                Objects.equals(ingredients, recipe.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
