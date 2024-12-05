package alura.practice.model;

import alura.practice.service.Forma;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculoArea() {
        return Math.PI * raio * raio;
    }

}
