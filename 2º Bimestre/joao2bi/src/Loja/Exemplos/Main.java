package Exemplos;

public class Main {
    public static void main(String[]args){

        Carro carro = new Carro("azul","BMW ", "ABC1233",2022,new Motor(150 ,1.6,7) );
        System.out.println(carro.getMomo().getClassificacao());
        // Roda roda = new Roda(26,34);
        carro.addroda(new Roda(26,34));
        carro.addroda(new Roda(23,34));
        carro.addroda(new Roda(56,34));
        carro.addroda(new Roda(126,34));

        for(Roda roda: carro.getRod())
        {
            System.out.println(roda.getAro());
        }
    }
}
