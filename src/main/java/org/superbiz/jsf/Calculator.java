package org.superbiz.jsf;

import jakarta.ejb.Local;

@Local
public interface Calculator {
    public double add(double x, double y);
}