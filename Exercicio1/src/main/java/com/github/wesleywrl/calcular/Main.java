/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.wesleywrl.calcular;

/**
 * Tenta imprimir o resultado da expressão matemática fornecida ao executar.
 *
 * @author Wesleywrl
 */
public final class Main {

    private Main() {
    }

    /**
     * Tenta imprimir o resultado da expressão matemática fornecida ao executar.
     *
     * @param args O primeiro elemento deve ser a expressão a ser calculada.
     */
    public static void main(final String[] args) {
        String expressao;

        //Verifica se não foi fornecido argumentos na execução do programa
        if (args == null) {
            System.err.println("Expressão não fornecida.");
            System.exit(1);
        } else {
            expressao = args[0];
            //Tenta imprimir o resultado da expressão fornecida
            try {
                System.out.println(Calcular.valorExpressao(expressao));
                System.exit(0);
            } catch (IllegalArgumentException iae) {
                System.err.println("Expressão inválida.");
                System.exit(1);
            }
        }
    }

}