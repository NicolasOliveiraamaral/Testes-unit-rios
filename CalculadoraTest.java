package com.mycompany.main;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.subtrair(7, 3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(24, calc.dividir(6, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        calc.dividir(6, 0);
    }

}
