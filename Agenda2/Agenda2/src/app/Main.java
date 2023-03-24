
package app;

import banco.BancoDAO;
import Model.Contato;
import Model.Telefone;

/**
 *
 * @author AndreN
 */
public class Main {
    public static void main(String[] args) {
        BancoDAO banco = new BancoDAO();
        Contato c = new Contato();
        Telefone t = new Telefone();
        t.setDescricao("87888990");
        c.setNome("André");
        banco.insertOrUpdate(c);
    }
}
