package Motorugo;

public class motordecarro implements Motor{
    @Override
    public void liga () {

            System.out.println("Motor do carro ligando");
            System.out.println(" She's not a saint and she's not what you think\n" +
                    "She's an actress, whoa\n" +
                    "She's better known for the things that she does\n");

    }

    @Override
    public void desliga() {

            System.out.println("Motor do carro desligando");
            System.out.println("fraaaun");
        System.out.println("\n");

    }
}
