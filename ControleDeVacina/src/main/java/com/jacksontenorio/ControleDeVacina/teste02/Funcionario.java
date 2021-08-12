package com.jacksontenorio.ControleDeVacina.teste02;

public class Funcionario {
    public static void main(String[] args) {
        Trabalho trabalho = new Trabalho();
        trabalho.nome = "Jackson";
        trabalho.cargo = "Estagiário";
        trabalho.salario = 800.00;
        trabalho.tipo = "100% home office";
        trabalho.dados();
        trabalho.status();
    }
}
