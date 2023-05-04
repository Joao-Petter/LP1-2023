

import java.util.ArrayList;
import java.util.List;
public class Carro {
    private String cor;
    private String modelo;
    private String placa;
    private int ano;
    private Motor momo;
    private List <Roda> rod = new ArrayList<>();



    public Carro(String cor, String modelo, String placa, int ano, Motor momo) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.momo = momo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public Motor getMomo() {
        return momo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMomo(Motor momo) {
        this.momo = momo;
    }


    public void addroda(Roda roda){
        this.rod.add(roda);
    }

    public List<Roda> getRod() {
        return rod;
    }
}
