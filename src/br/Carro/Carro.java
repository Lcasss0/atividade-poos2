package br.Carro;

public class Carro {
    public String marca;
    protected String modelo;
    int ano;
    private double preco;

    //construtor defuault;
    public Carro(){

    }
    public Carro(String marca,String modelo, int ano, double preco){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;

    }

    //metodo publico que ira exibir as informaçoes do veiculo no terminal;;//sobescrevendo metodo toString;
    public String exibirDetalhes() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }


}
