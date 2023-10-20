package org.superbiz.jsf;

import jakarta.ejb.Stateless;

@Stateless
public class CalculatorImpl implements Calculator {

    public double add(double x, double y) {
        return x + y;
    }
}