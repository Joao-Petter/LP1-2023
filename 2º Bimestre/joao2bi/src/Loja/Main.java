
package Loja;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
        //Clientes clic = new Clientes("lala",123,9981233);
        Loja lol = new Loja("Marabraz");

        Clientes cl1 = new Clientes("lala",1234,92837-20);
        Clientes cl2 = new Clientes("ruanes",1234,92837-20);

        lol.addped(new Pedidos(cl1,"maquina",122.2,232));
        lol.addped(new Pedidos(cl2,"lixeira",99.4,020));

        lol.addclie(new Clientes("Laura",608355636,119981233));
        lol.addclie(new Clientes("Marayo",133077595,119343933));
        lol.addclie(new Clientes("Maraíso",23465912,119343933));
        lol.addclie(new Clientes("Camilla",345335776,119343933));
        lol.addclie(new Clientes("Pedro",193367431,119343933));
       // lol.addped();



        //como exibir o nome em for

        for(Clientes cli: lol.getCli()
        {
            System.out.println(cli.getNome()+" " + cli.getCpf());

        }


    }

}
