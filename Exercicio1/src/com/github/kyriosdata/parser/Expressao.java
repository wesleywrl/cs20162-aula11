/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.parser;

import java.util.Map;

/**
 * Encapsula uma expressão que produz um
 * valor {@code float} quando avaliada.
 *
 * <p>Essa interface trabalha em conjunto com a
 * interface {@link IParser} para isolar o
 * domínio de tecnologias de implementação
 * de compiladores de expressões e a
 * execução correspondente.
 *
 * @see IParser
 */
public interface Expressao {

    /**
     * Obtém o valor produzido pela execução
     * da expressão.
     *
     * @return Valor {@code double} obtido da
     * avaliação da expressão.
     */
    float valor();

    /**
     * Obtém o valor produzido pela avaliação
     * da expressão.
     *
     * @param contexto Dicionário contendo valores
     *                 de variáveis, possivelmente
     *                 empregadas para avaliar a expressão.
     *
     * @return Valor {@code double} obtido da
     * avaliação da expressão.
     */
    float valor(Map<String, Float> contexto);
}
