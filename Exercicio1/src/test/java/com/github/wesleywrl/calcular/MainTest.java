
package com.github.wesleywrl.calcular;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 *
 * @author Wesleywrl
 */
public class MainTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void rodarSemExpressao() {
        exit.expectSystemExitWithStatus(1); //Espera sair com erro (1)
        String[] args = null;
        Main.main(args);

    }

    @Test
    public void rodarExpressaoInvalida() {
        exit.expectSystemExitWithStatus(1); //Espera sair com erro (1)
        String[] args = {"+-"};
        Main.main(args);

    }

    @Test
    public void rodarExpressaoValida() {
        exit.expectSystemExitWithStatus(0); //Espera sair sem erro (0)
        String[] args = {"(2+5)/2"};
        Main.main(args);
    }
}