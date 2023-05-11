
package Loja;
public class Clientes  {
  private String nome;
  private int Cpf;
  private int telefone;


    public Clientes(String nome, int cpf, int telefone) {
        this.nome = nome;
        this.Cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;Clientes
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int cpf) {
        Cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
  public void showcliente()
    {

            System.out.println(getNome()+" "+ getCpf());



    }
}


}


