package main.java;
public abstract class Exame {

    private int cadastro;
    protected String nome;
    private float resultado1;
    private float resultado2;
   

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getResultado1() {
        return resultado1;
    }

    public void setResultado1(float resultado1) {
        this.resultado1 = resultado1;
    }

    public float getResultado2() {
        return resultado2;
    }

    public void setResultado2(float resultado2) {
        this.resultado2 = resultado2;
    }

    public float calcularMedia() {
        return (this.resultado1 + this.resultado2) / 2;
    }

    public abstract String verificarResultado();

    public String getTipo() {
        return "Exame";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "cadastro=" + this.cadastro +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarResultado() +
                '}';
    }
}