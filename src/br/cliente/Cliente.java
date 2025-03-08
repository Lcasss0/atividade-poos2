package br.cliente;

public class Cliente {
    protected String nome;
    String cpf;

    //construtor default;
    public Cliente(){

    }
    //construtor com 2 parametros;
    public Cliente(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }


    public String exibirDadosCliente() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
