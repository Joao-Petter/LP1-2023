package Exceptions;

public class Main {
    public static void main(String[] args) {
        Contas c = new Infantil(5000.0);
        // c não tem os métodos de infantil
        c.depositar(50.5);

        System.out.println(c.getSaldo());
        Infantil i = (Infantil) c; // transformando para Infantil;
        System.out.println("SDF"+i.getSaldo());
        i.comprar(100.0);


        Empresarial e = new Empresarial(1000.0, "12345667898");
        System.out.println(e.sacar(50.0));

        Pessoal p = new Pessoal(1000.0, "12346567");
        System.out.println(p.sacar(50.0));
        try {
            System.out.println(p.dividir(0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
