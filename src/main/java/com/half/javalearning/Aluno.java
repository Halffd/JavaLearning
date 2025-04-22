package com.half.javalearning;

public class Aluno {
    /* Atributos */
    private String nome;
    /* Getters e Setters */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Static methods
    public static void criar(){
        Aluno a = new Aluno();
        a.setNome("Joao");
        System.out.println("saida: "+a.getNome());
    }
}
