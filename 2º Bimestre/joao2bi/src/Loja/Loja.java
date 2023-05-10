
package Loja;
import java.util.ArrayList;
import java.util.List;
public class Loja {
    private String nomeloja;
    private List <Clientes> cli = new ArrayList<>();
    private List <Pedidos> ped = new ArrayList<>();


    public Loja(String nomel) {
        this.nomeloja = nomel;

    }

    public String getNomel() {
        return nomeloja;
    }

    public void setNomel(String nomel) {
        this.nomeloja = nomel;
    }

    public List<Clientes> getCli() {

        return cli;
    }

    public void addclie(Clientes cli) {

        this.cli.add(cli);  //esse segundo cli é o parâmetro.
    }

    public List<Pedidos> getPed() {

        return ped;
    }

    public void addped(Pedidos ped) {

        this.ped.add(ped);
    }
}
