package com.dumai.deplacementPersonnageTest;
import com.dumai.deplacementPersonnage.DeplacementPersonnage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class deplacementPersonnageTest {
    private DeplacementPersonnage monP;
    private String expected;
    @BeforeEach
    public void setUp(){
         monP = new DeplacementPersonnage();
    }
    @Test
    public void devrait_retourner_est(){
        expected = "EST";
        assertThat(monP.tourner(1)).isEqualTo(expected);
    }
}
