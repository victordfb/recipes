package com.minascafe.recipes;

class IngredientAmountCalculatorFactory {

    IngredientAmountCalculator from(Ingredient water) {
        return new IngredientAmountCalculator(water);
    }
}
