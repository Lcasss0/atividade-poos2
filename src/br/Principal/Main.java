package br.Principal;

import br.Carro.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("chevrolet","onix",2020,75000);
        System.out.println(carro.exibirDetalhes());
    }
}
