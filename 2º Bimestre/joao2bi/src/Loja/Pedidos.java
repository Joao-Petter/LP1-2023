
package Loja;
public class Pedidos {
    private Clientes cli;
    private String produto;
    private double valor;
    private  double  codigo;


    public Pedidos(Clientes cli, String produto, double valor, double codigo) {
        this.cli = cli;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Clientes getClientes() {

        return cli;
    }

    public void setCli(Clientes cli) {

        this.cli = cli;
    }

    public String getProduto() {

        return produto;
    }

    public void Produto(String produto) {

        this.produto = produto;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public double getCodigo() {

        return codigo;
    }

    public void setCodigo(double codigo) {

        this.codigo = codigo;
    }


}
