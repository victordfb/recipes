package com.minascafe.recipes;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IngredientAmountCalculatorTest {

    private IngredientAmountCalculatorFactory ingredientCalculatorFactory;

    @Before
    public void setUp() {
        ingredientCalculatorFactory = new IngredientAmountCalculatorFactory();
    }

    @Test
    public void shouldCalculateIngredientQuantityUsingFractions() {

        Ingredient water = new Ingredient("Water", new Fraction("2/1"));
        IngredientAmountCalculator calculator = ingredientCalculatorFactory.from(water);

        Ingredient doubleWater = calculator.times(new Fraction("2/1"));

        assertThat(doubleWater.getAmount()).isEqualTo(new Fraction("4/1"));
    }

    @Test
    public void shouldMultiplyIngredientUsingNaturalNumbers() {

        Ingredient water = new Ingredient("Water", new Fraction("2/1"));
        IngredientAmountCalculator calculator = ingredientCalculatorFactory.from(water);

        Ingredient doubleWater = calculator.grow(3);

        assertThat(doubleWater.getAmount()).isEqualTo(new Fraction("6/1"));
    }

    @Test
    public void shouldDivideIngredientUsingNaturalNumbers() {

        Ingredient water = new Ingredient("Water", new Fraction("6/1"));
        IngredientAmountCalculator calculator = ingredientCalculatorFactory.from(water);

        Ingredient doubleWater = calculator.shrink(3);

        assertThat(doubleWater.getAmount()).isEqualTo(new Fraction("2/1"));
    }
}
