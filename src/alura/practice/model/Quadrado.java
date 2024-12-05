package alura.practice.model;

import alura.practice.service.Forma;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return lado * lado;
    }
}
