package Heranca;

public class Variavel extends Gastos {
    private int months;
    public Variavel(String nome, double valor,int months) {
        super(nome, valor);
        this.months= months;
    }


    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
