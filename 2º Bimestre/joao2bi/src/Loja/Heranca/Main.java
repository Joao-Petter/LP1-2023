package Heranca;

public class Main {
  public static void main(String[]args){
      Lazer beach = new Lazer("praia de ubatuba",900.00, true);
      beach.changevalue(1200.00);
      beach.setImportante(false);
      System.out.println(" O novo valor é :"+beach.getValor());

      Fixo fix = new Fixo("comida",100.00);
      System.out.println("De gastos fixos tenho"+fix.getNome()+", com valor de:"+fix.getValor());

      Variavel var = new Variavel("Passeios",20.90,7);
      var.setMonths(4);
      System.out.println("Em "+var.getNome()+" gastei "+var.getValor()+" em "+var.getMonths()+" meses");


  }

}