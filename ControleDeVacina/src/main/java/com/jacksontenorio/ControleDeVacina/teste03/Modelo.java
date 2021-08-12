package com.jacksontenorio.ControleDeVacina.teste03;

public class Modelo {
    public String nome;
    public float altura;
    public float peso;
    public int idade;
    public String tipo;

    public void nivelAtor(){
        if (this.tipo == "Modelo"){
            System.out.println("Só grava malhacao.");
        } else if (this.tipo == "Ator"){
            System.out.println("Só grava novelas.");
        }else{
            System.out.println("Erro!");
        }
    }
}
