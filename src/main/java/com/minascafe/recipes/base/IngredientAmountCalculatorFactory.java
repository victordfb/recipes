package com.minascafe.recipes.base;

class IngredientAmountCalculatorFactory {

    IngredientAmountCalculator from(Ingredient water) {
        return new IngredientAmountCalculator(water);
    }
}
