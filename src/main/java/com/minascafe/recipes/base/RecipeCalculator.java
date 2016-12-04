package com.minascafe.recipes.base;

class RecipeCalculator {

    private final Recipe recipe;

    RecipeCalculator(Recipe recipe) {
        this.recipe = recipe;
    }

    Recipe times(Fraction fraction) {
        IngredientAmountCalculatorFactory factory = new IngredientAmountCalculatorFactory();
        RecipeBuilder recipeBuilder = new RecipeBuilder().withName(recipe.getName());
        recipe.getIngredients().forEach(ingredient -> recipeBuilder.addIngredient(factory.from(ingredient).times(fraction)));
        return recipeBuilder.build();
    }
}
