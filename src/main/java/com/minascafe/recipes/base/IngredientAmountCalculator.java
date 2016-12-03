package com.minascafe.recipes.base;

class IngredientAmountCalculator {


    private final Ingredient water;

    IngredientAmountCalculator(Ingredient water) {
        this.water = water;
    }

    Ingredient times(Fraction ratio) {
        return new Ingredient(water.getName(), water.getAmount().times(ratio));
    }

    Ingredient grow(Integer factor) {
        return new Ingredient(water.getName(), water.getAmount().times(new Fraction(factor + "/1")));
    }

    Ingredient shrink(Integer factor) {
        return new Ingredient(water.getName(), water.getAmount().times(new Fraction("1/" + factor)));
    }
}
