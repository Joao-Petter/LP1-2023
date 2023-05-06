
package Loja;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
        //Clientes clic = new Clientes("lala",123,9981233);
        Loja lol = new Loja("marabraz");
        Clientes cli1 = new Clientes("lala",1234,92837-20);

        lol.addped(new Pedidos(cli1,"maquina",122.2,23.2));

        lol.addclie(new Clientes("Laura",60835563,119981233));
        lol.addclie(new Clientes("Bianca",133050595,119343933));
       // lol.addped();


        for(Pedidos ped: lol.getPed()/*esse get cli retorna quantos cli eu tenho? método esta em loja*/) {
            System.out.println(ped.getProduto());

        }

        //for(Clientes c)

        for(Clientes cli: lol.getCli()/*esse get cli retorna quantos cli eu tenho? método esta em loja*/)
        {
            System.out.println(cli.getNome()+cli.getCpf());
            System.out.println(" ");
        }


    }

}
