package com.github.wesleywrl.calcular;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Wesleywrl
 */
public class CalcularTest {

    @Test(expected = IllegalArgumentException.class)
    public void expressaoInexistente() {
        Calcular.valorExpressao("+");
    }

    @Test
    public void expressaoValida() {
        Assert.assertEquals(8f, Calcular.valorExpressao("3+5"), 0.001f);
    }

}