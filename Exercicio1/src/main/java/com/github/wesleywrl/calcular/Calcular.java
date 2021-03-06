/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.wesleywrl.calcular;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;
import java.util.List;

/**
 * Utiliza o Parser para obter o valor de expressões matemáticas.
 *
 * @author wesleywrl
 */
public final class Calcular {

    /**
     * Impede instanciação dessa classe.
     */
    private Calcular() {
    }

    /**
     * Retorna o valor de uma expressão matemática inserida em forma de string.
     *
     * @param expressao String com a expressão cujo valor deseja-se saber.
     * @return Valor resultante da expressão matemática inserida.
     */
    public static float valorExpressao(final String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao().valor();
    }

}
