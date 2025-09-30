package com.dumai.FizzBuzzTest;

import com.dumai.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    private FizzBuzz f;
    private String expected;
    @BeforeEach
    public void setup() {
        f = new FizzBuzz();
    }
    @Test
    public void devrait_retourner_fizz(){
        expected = "Fizz";
        assertThat(f.de(3)).isEqualTo(expected);
    }
}
