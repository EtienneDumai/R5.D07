package com.dumai.FacteursPremiersTest;

import com.dumai.FacteursPremiers.FacteursPremiers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class FacteursPremiersTest {
    private FacteursPremiers f;
    private List<Integer>listeExpected;
    @BeforeEach
    public void setUp(){
        f = new FacteursPremiers();
        listeExpected = new ArrayList<>();
    }
    @Test
    public void devrait_renvoyer_une_liste_vide(){
        assertThat(f.generer(1)).isEmpty();
    }

    @Test
    public void devrait_retourner_liste_avec_2(){
        listeExpected.add(2);
        assertThat(f.generer(2)).isEqualTo(listeExpected);
    }
    @Test
    public void devrait_retourner_liste_avec_2_2(){
        listeExpected.add(2);
        listeExpected.add(2);
        assertThat(f.generer(4)).isEqualTo(listeExpected);
    }
    @Test
    public void devrait_renvoyer_liste_avec_2_2_3_7(){
        listeExpected.add(2);
        listeExpected.add(2);
        listeExpected.add(3);
        listeExpected.add(7);
        assertThat(f.generer(84)).isEqualTo(listeExpected);
    }
}
