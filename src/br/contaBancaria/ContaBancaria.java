package br.contaBancaria;

public class ContaBancaria {
    public String numeroConta;
    private double saldo;


    public ContaBancaria(){

    }
    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta =numeroConta;
        this.saldo = saldo;
    }

    public double exibirSaldo() {
        return saldo;
    }
}
