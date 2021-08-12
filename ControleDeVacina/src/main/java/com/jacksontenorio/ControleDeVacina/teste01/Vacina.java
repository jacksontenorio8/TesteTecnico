package com.jacksontenorio.ControleDeVacina.teste01;

public class Vacina {
    public String tipoVacina;
    public String intervalo;

    public void intervalo (){
        if (this.tipoVacina == "CoronaVac"){
            System.out.println("Intervalo de 15 dias");
        } else if (this.tipoVacina == "Janssen"){
            System.out.println("dose única");
        } else{
            System.out.println("Erro!");
        }
    }
}
