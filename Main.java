/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int resultadoSoma = calc.somar(5, 3);
        int resultadoSubtracao = calc.subtrair(8, 2);
        int resultadoMultiplicacao = calc.multiplicar(4, 6);
        int resultadoDivisao = calc.dividir(10, 2);
        
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}

