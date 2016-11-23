/*
 * Copyright (c) 2016. Fabrica de Software - Instituto de Informatica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.wesleywrl.calcular;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;


/**
 *O Parser será utilizado para se obter o valor das expressões matemáticas;
 * @author Wesley Ramos
 */
public class Calcular {
    
    /**
     * Retorna o valor de uma expressão matemática inserida em forma de string.
     *
     * @param operacao String com a expressão cujo valor deseja-se saber.
     * @return Valor resultante da expressão matemática inserida.
     */

    public static double calcularOperacao(String operacao){
        Lexer calcular = new Lexer(operacao);
        Parser parser = new Parser(calcular.tokenize());
        return (parser.expressao().valor());
    }
}
