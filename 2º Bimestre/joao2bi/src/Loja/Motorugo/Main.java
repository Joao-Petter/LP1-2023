package Motorugo;
import java.util.ArrayList;

public class Main{

    public static void main (String[]args){
        motomaris caneta = new motomaris();
        motodomeu m = new motodomeu();
        motordecarro car = new motordecarro();
        ArrayList<Double> carro = new ArrayList();
        carro.add(1.2);
        for (double re: carro) {
            
        }
        


        car.liga();
        car.desliga();

        caneta.liga();
        caneta.desliga();

        m.liga();
        m.desliga();

    }






}
