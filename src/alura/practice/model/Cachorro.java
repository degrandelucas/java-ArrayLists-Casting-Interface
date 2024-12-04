package alura.practice.model;

public class Cachorro extends Animal {

    public Cachorro(String raca) {
        super(raca);
    }

    //metodo especifico da classe Cachorro
    public void emiteSom(){
        System.out.println(getRaca() + " emite Som");
    }



}
