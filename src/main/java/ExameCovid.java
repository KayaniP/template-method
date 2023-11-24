package main.java;

public class ExameCovid extends Exame{

    public String verificarResultado() {
        if (this.calcularMedia() >= 100.0f) {
            return "Positivo";
        }
        else {
            return "Negativo";
        }
    }

}

