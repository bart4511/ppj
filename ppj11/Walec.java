package com.company;

/**
 * Created by bartoszrogowski on 17/12/2016.
 */
public class Walec {
    private double promien;
    private double wysokosc;

    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        double polePowierzchni = Math.PI * promien * promien;
        System.out.println("Pole powierzchni podstawy: "
                + polePowierzchni);
        System.out.println("Objetosc walca: "
                + polePowierzchni * wysokosc);
    }
}
