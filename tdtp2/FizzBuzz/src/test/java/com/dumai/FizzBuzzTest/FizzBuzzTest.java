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
    @Test
    public void devrait_retourner_buzz(){
        expected = "Buzz";
        assertThat(f.de(5)).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_fizzbuzz(){
        expected = "FizzBuzz";
        assertThat(f.de(15)).isEqualTo(expected);
    }
    @Test
    public void devrait_retourner_nombre(){
        expected = "7";
        assertThat(f.de(7)).isEqualTo(expected);
    }
}
