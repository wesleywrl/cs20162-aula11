/*
 * Copyright (c) 2016. Fabrica de Software - Instituto de Informatica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.wesleywrl.calcular;

/**
 * Demonstra o resultado da expressão inserida;
 * @author Wesley Ramos
 */
public class Main {
    public static void main(String args[]){
        String operacao;
        operacao = args[0];
        if(args != null ){
            try {
                System.out.println(Calcular.calcularOperacao(operacao));
                System.exit(0);
            }catch (IllegalArgumentException error){
                System.err.println("Expressao inválida");
                System.exit(1);
                
            }
        }else {
            System.err.println("Expressão nula");
        }
    }
    
}
