package com.minascafe.recipes.base;

class RecipeCalculatorFactory {

    RecipeCalculator from(Recipe recipe) {
        return new RecipeCalculator(recipe);
    }
}
