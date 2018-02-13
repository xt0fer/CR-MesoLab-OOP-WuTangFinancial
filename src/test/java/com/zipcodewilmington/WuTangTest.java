package com.zipcodewilmington;

import org.junit.Test;

import static org.junit.Assert.*;

public class WuTangTest {

    @Test
    public void testUSD2USD() {

        Double expected = 5.0;
        WuTang wu = new WuTang();
        Double actual = wu.convert(WuTang.Currency.USD,5.00, WuTang.Currency.USD);
        assertEquals(expected,actual);
    }

    @Test
    public void testUSD2EUR() {

        Double expected = 5.31;
        WuTang wu = new WuTang();
        //Double actual = wu.usdToFX(WuTang.Currency.EUR, 5.00);
        Double actual = wu.convert(WuTang.Currency.USD,5.00, WuTang.Currency.EUR);
        assertEquals(expected,actual);
    }

    @Test
    public void testEUR2USD() {

        Double expected = 5.31;
        WuTang wu = new WuTang();
        //Double actual = wu.usdToFX(WuTang.Currency.EUR, 4.05);
        Double actual = wu.convert(WuTang.Currency.USD,5.00, WuTang.Currency.EUR);
        assertEquals(expected,actual);
    }

    @Test
    public void testEUR2STR() {

        Double expected = 6.09;
        WuTang wu = new WuTang();
        Double actual = wu.convert(WuTang.Currency.EUR,5.00, WuTang.Currency.STR);
        assertEquals(expected,actual);
    }


}