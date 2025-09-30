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
    @Test
    public void devrait_renvoyer_nord_avec_fois_sup_a_quatre(){
        expected = "EST";
        assertThat(monP.tourner(5)).isEqualTo(expected);
    }
    @Test
    public void devrait_renvoyer_nord_avec_beaucoup_de_tour(){
        expected = "NORD";
        assertThat(monP.tourner(56)).isEqualTo(expected);
    }
}
