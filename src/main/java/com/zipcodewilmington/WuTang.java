package com.zipcodewilmington;

import java.util.HashMap;

public class WuTang {

    public enum Currency {
        USD, //Us Dollar	USD1.00
        EUR, //Euro	0.94
        STR, // British Pound	0.82
        RUP, //Indian Rupee	68.32
        AUS, //Australian Dollar	1.35
        CDN, //Canadian Dollar	1.32
        SGP, //Singapore Dollar	1.43
        SFR, //Swiss Franc	1.01
        RGG, //Malaysian Ringgit	4.47
        JYN, //Japanese Yen	115.84
        REN //Chinese Yuan Renminbi	6.92
    }

    private HashMap<Currency,Double> rateMap;

    public WuTang() {
        rateMap = new HashMap<Currency, Double>();
        rateMap.put(Currency.USD, 1.00);
        rateMap.put(Currency.EUR, 0.94);
        rateMap.put(Currency.STR, 0.82);
        rateMap.put(Currency.RUP, 68.32);
        rateMap.put(Currency.AUS, 1.35);
        rateMap.put(Currency.CDN, 1.32);
        rateMap.put(Currency.SGP, 1.43);
        rateMap.put(Currency.SFR, 1.01);
        rateMap.put(Currency.RGG, 4.47);
        rateMap.put(Currency.JYN, 115.84);
        rateMap.put(Currency.REN, 6.92);

    }

    private static Double scale(Double d) {
        int ix = (int)(d * 100.0); // scale it
        return ((double)ix)/100.0;
    }

    // returns USD
    private Double fxToUSD(Currency fx, Double value) {
        return rateMap.get(fx) * value;
    }

    // returns fx
    private Double usdToFX(Currency fx, Double value) {
        return (1/rateMap.get(fx)) * value;
    }

    public Double convert(Currency from, Double value, Currency to) {
        if (from.equals(to)) return value;
        Double intermediateResult = this.fxToUSD(from, value);
        //System.out.printf("", intermediateResult);
        return this.usdToFX(to, intermediateResult);
    }


    public static String toString(Double value) {
        return String.format("%8.2f", scale(value));
    }
}
