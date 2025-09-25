package com.dumai.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
public class CalculatorTest {
    private Calculator c;
    @BeforeEach
    void setUp() {
        c =  new Calculator();
    }
    @Test
    public void devrait_additioner_sans_erreur(){
        assertThat(c.add(1,2)).isEqualTo(3);
    }
    @Test
    public void devrait_diviser_sans_erreur(){
        assertThat(c.divide(10,2)).isEqualTo(5);
    }
    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    public void devrait_additioner_avec_valeurs_parametrees(int opG, int opD, int resultatAttendu) {
        assertThat(c.add(opG, opD)).isEqualTo(resultatAttendu);
    }
}
