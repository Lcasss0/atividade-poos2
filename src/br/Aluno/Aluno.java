package br.Aluno;

public class Aluno {
    protected String nome;
    private int idade;
    public String matricula;
    String curso;

    public Aluno(){

    }
    //construtor aluno;
    public Aluno(String nome, int idade, String matricula, String curso){

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String exibirInformacoes() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
