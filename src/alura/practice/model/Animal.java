package alura.practice.model;

public class Animal {
    private String raca;

    public Animal(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
