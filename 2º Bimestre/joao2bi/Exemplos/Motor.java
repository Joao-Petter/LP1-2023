package Exemplos;

public class Motor {
    private int potencia;
    private double classificacao;
    private int valvulas;

    public Motor(int pot, double classifi, int valv)
    {    this.potencia=pot;
        this.classificacao= classifi;
        this.valvulas=valv;

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
}
