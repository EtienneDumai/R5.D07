package com.dumai.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
}
