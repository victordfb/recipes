package com.minascafe.recipes;

import java.util.Objects;

import static java.lang.Integer.parseInt;
import static java.lang.String.format;

class Fraction {

    private final int nominator;
    private final int denominator;

    Fraction(int nominator, int denominator) {
        int mdc = maximoDivisorComumEuclidiano(nominator, denominator);
        this.nominator = nominator / mdc;
        this.denominator = denominator / mdc;
    }

    Fraction(String fraction) {
        this(parseInt(fraction.split("/")[0]), parseInt(fraction.split("/")[1]));
    }

    Fraction times(Fraction other) {
        return new Fraction(this.nominator * other.nominator, this.denominator * other.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return nominator == fraction.nominator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominator, denominator);
    }

    @Override
    public String toString() {
        return format("%d/%d", nominator, denominator);
    }

    private int maximoDivisorComumEuclidiano(int nominator, int denominator) {
        int a = Math.max(nominator, denominator);
        int b = Math.min(nominator, denominator);
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
