package alura.practice.application;

import alura.practice.model.*;
import alura.practice.service.Forma;

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

        System.out.println("");
        //4- Loop para calculo de preco medio no ArrayList
        Produto produto1 = new Produto("Arroz 5kg", 30.52);
        Produto produto2 = new Produto("Arroz 1kg", 9.30);
        Produto produto3 = new Produto("Feijao 2kg", 12.69);
        Produto produto4 = new Produto("Leite", 5.12);
        Produto produto5 = new Produto("Tomate kg", 3.99);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.addAll(Arrays.asList(produto1, produto2, produto3, produto4, produto5));
        double  precoMedio = 0;
        double totalPreco = 0;
        for (Produto item : produtos){
            totalPreco += item.getPreco();
        }
        precoMedio = totalPreco / produtos.size();
        System.out.println("A soma dos precos dos produtos da lista atualmente R$ " + totalPreco);
        System.out.println("O preco medio dos produtos da lista seria R$ " + precoMedio);

        System.out.println("");
        //5- uso de Interface e Loop para calculo de area de formas inseridas pelo usuario
        Quadrado figura1 = new Quadrado(5.2);
        Quadrado figura2 = new Quadrado(3);

        Circulo figura3 = new Circulo(2);
        Circulo figura4 = new Circulo(3.5);

        ArrayList<Forma> figuras = new ArrayList<>();
        //figuras.add((Forma) Arrays.asList(figura1, figura2, figura3, figura4));
        figuras.add(figura1);
        figuras.add(figura2);
        figuras.add(figura3);
        figuras.add(figura4);
        for (Forma figura : figuras){
            System.out.println(String.format("Area do %s : %.2f m²", figura.getClass().getSimpleName(),figura.calculoArea()));
        }

        System.out.println("");
        //6- uso de forEach para encontrar a conta com maior saldo, trabalhando com ArrayList das Contas Bancarias
        ContaBancaria contaCorrente1 = new ContaBancaria("123-4");
        contaCorrente1.deposito(500.25);
        ContaBancaria contaCorrente2 = new ContaBancaria("333-4");
        contaCorrente2.deposito(125.22);
        ContaBancaria contaCorrente3 = new ContaBancaria("444-4");
        contaCorrente3.deposito(1000.00);
        ContaBancaria contaCorrente4 = new ContaBancaria("555-4");
        contaCorrente4.deposito(985.90);
        ArrayList<ContaBancaria> contasCorrente = new ArrayList<>();
        contasCorrente.addAll(Arrays.asList(contaCorrente1, contaCorrente2, contaCorrente3, contaCorrente4));
        double saldoMaiorValor = contaCorrente1.getSaldo();
        String contaComMaiorValor = contaCorrente1.getConta();
        for (ContaBancaria conta : contasCorrente){
            if (saldoMaiorValor < conta.getSaldo()) {
                saldoMaiorValor = conta.getSaldo();
                contaComMaiorValor = conta.getConta();
            }
        }
        System.out.println(String.format("O maior valor atual entre as contas é R$ %.2f que pertence a conta %s",saldoMaiorValor,contaComMaiorValor));

    }
}