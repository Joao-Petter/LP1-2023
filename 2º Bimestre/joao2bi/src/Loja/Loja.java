package Loja;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
        //Clientes clic = new Clientes("lala",123,9981233);
        Loja lol = new Loja("Marabraz");

        Clientes cl1 = new Clientes("lala","126534","2837-20");
        Clientes cl2 = new Clientes("ruanes","123564","92837-20");

        lol.addped(new Pedidos(cl1,"maquina",122.2,232));
        lol.addped(new Pedidos(cl1,"lixeira",99.4,20));

        lol.addclie(cl1);
        lol.addclie(new Clientes("Laura","608355636","119981233"));
        lol.addclie(new Clientes("Marayo","133077595","119343933"));



        cl1.showcliente();

        for (Pedidos pd: lol.getPed()) {
            if (pd.getClientes().getNome() == "lala"){
                System.out.println(pd.getCodigo() +" "+ pd.getProduto() +" "+ pd.getValor());
            }
        }



    }

}
