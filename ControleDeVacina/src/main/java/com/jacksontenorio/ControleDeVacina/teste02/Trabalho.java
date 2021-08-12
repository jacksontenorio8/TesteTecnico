package com.jacksontenorio.ControleDeVacina.teste02;

public class Trabalho {
    public String nome;
    public String cargo;
    public double salario;
    public String tipo;

    public void dados() {
        System.out.println("Nome: "+ nome);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Salario: "+ salario);
    }

    public void status(){
        if (this.tipo == "Estagiário") {
            System.out.println("100% home office");
        } else if (this.cargo == "Junior"){
            System.out.println("Presencial");
        } else {
            System.out.println("Híbrido");
        }
    }
}
