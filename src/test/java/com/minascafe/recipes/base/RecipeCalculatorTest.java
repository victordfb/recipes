package com.minascafe.recipes.base;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecipeCalculatorTest {

    private RecipeCalculatorFactory recipeCalculatorFactory;

    @Before
    public void setUp() {
        recipeCalculatorFactory = new RecipeCalculatorFactory();
    }

    @Test
    public void shouldCalculateAmountForEachIngredient() {

        Recipe blackCoffee = new RecipeBuilder()
                .withName("Black Coffee")
                .addIngredient(new Ingredient("Water", new Fraction("2/1")))
                .addIngredient(new Ingredient("Coffee", new Fraction("3/1")))
                .build();

        Recipe doubleBlackCoffee = recipeCalculatorFactory.from(blackCoffee).times(new Fraction("2/1"));

        assertThat(doubleBlackCoffee)
                .isEqualTo(new RecipeBuilder()
                        .withName("Black Coffee")
                        .addIngredient(new Ingredient("Water", new Fraction("4/1")))
                        .addIngredient(new Ingredient("Coffee", new Fraction("6/1")))
                        .build());
    }
}
