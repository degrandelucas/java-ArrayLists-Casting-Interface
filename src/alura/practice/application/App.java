package alura.practice.application;

import alura.practice.model.Animal;
import alura.practice.model.Cachorro;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //1- Exemplo ArrayList
        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(Arrays.asList("Lucas", "Danyelle", "Jose", "Maria"));
        //ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Lucas", "Danyelle", "Jose", "Maria"));
        nomes.forEach(nome -> System.out.println(nome));
        //nomes.forEach(System.out::println);
        /*
        for (String nome : nomes)
            System.out.println(nome);
        */

        System.out.println("");
        //2 , 3- Exemplo de casting e instanceof
        Cachorro buldogue = new Cachorro("Buldogue");
        buldogue.emiteSom();
        Animal poodle = new Cachorro("Poodle");
        // poodle.emiteSom(); nao consegue acessar o metodo
        if (poodle instanceof Cachorro){
            ((Cachorro) poodle).emiteSom();
        }
    }
}