package com.zipcodewilmington;

import org.junit.Test;

import static org.junit.Assert.*;

public class WuTangTest {

    @Test
    public void testUSD2USD() {

        Double expected = 5.0;
        WuTang wu = new WuTang();
        Double actual = wu.convert(WuTang.Currency.USD,5.00, WuTang.Currency.USD);
        assertEquals(WuTang.toString(expected),WuTang.toString(actual));
    }

    @Test
    public void testUSD2EUR() {

        Double expected = 5.31;
        WuTang wu = new WuTang();
        //Double actual = wu.usdToFX(WuTang.Currency.EUR, 5.00);
        Double actual = wu.convert(WuTang.Currency.USD,5.00, WuTang.Currency.EUR);
        assertEquals(WuTang.toString(expected),WuTang.toString(actual));
    }

    @Test
    public void testEUR2USD() {

        Double expected = 4.69;
        WuTang wu = new WuTang();
        //Double actual = wu.usdToFX(WuTang.Currency.EUR, 4.05);
        Double actual = wu.convert(WuTang.Currency.EUR,5.00, WuTang.Currency.USD);
        // System.out.println(WuTang.toString(actual));
        assertEquals(WuTang.toString(expected),WuTang.toString(actual));
    }

    @Test
    public void testEUR2STR() {

        Double expected = 5.73;
        WuTang wu = new WuTang();
        Double actual = wu.convert(WuTang.Currency.EUR,5.00, WuTang.Currency.STR);
        assertEquals(WuTang.toString(expected),WuTang.toString(actual));
    }

    @Test
    public void testYenToRupees() {

        Double expected = 8477.75;
        WuTang wu = new WuTang();
        Double actual = wu.convert(WuTang.Currency.JYN,5000.00, WuTang.Currency.RUP);
        assertEquals(WuTang.toString(expected),WuTang.toString(actual));
    }


}