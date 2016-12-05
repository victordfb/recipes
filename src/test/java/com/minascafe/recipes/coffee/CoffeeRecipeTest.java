package com.minascafe.recipes.coffee;

import com.minascafe.recipes.base.Fraction;
import com.minascafe.recipes.base.Ingredient;
import org.junit.Test;

public class CoffeeRecipeTest {

    @Test
    public void shouldCalculateRecipesByNumberOfCups() {

        CoffeeRecipe frenchPress =
                new CoffeeRecipeBuilder()
                        .withName("FrenchPress")
                        .addIngredient(new Ingredient("Water", new Fraction("2/1")))
                        .addIngredient(new Ingredient("Coffee", new Fraction("3/1")))
                        .makesCups(2)
                        .build();
    }
}
