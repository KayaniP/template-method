package main.java;

    public class ExameDengue extends Exame {

        public String verificarResultado() {
            if (this.calcularMedia() >= 50.0f) {
                return "Positivo";
            }
            else {
                return "Negativo";
            }
        }
    
        @Override
        public String getTipo() {
            return "Exame Dengue";
        }
}
