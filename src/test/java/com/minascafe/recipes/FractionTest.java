package com.minascafe.recipes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {

    @Test
    public void deveriaCriarUmaFracao() {

        Fraction two = new Fraction(2, 1);

        assertThat(two).isEqualTo(new Fraction("2/1"));
    }

    @Test
    public void deveriaMultiplicarPorOutraFracaoComDenominadorUm() {

        Fraction two = new Fraction(2, 1);
        Fraction five = new Fraction(5, 1);

        Fraction tenFraction = two.times(five);

        assertThat(tenFraction).isEqualTo(new Fraction("10/1"));
    }

    @Test
    public void deveriaMultiplicarPorOutraFracaoComDenominadorDiferenteDeUm() {

        Fraction two = new Fraction(3, 2);
        Fraction five = new Fraction(5, 2);

        Fraction fifteenByFour = two.times(five);

        assertThat(fifteenByFour).isEqualTo(new Fraction("15/4"));
    }

    @Test
    public void deveriaSimplificarAsFracoes() {

        Fraction two = new Fraction(6, 3);

        assertThat(two).isEqualTo(new Fraction(2, 1));
    }
}
