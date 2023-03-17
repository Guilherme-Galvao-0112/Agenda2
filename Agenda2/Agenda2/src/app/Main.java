
package app;

import banco.BancoDAO;
import Model.Contato;

/**
 *
 * @author AndreN
 */
public class Main {
    public static void main(String[] args) {
        BancoDAO banco = new BancoDAO();
        Contato c = new Contato();
        c.setNome("André");
        banco.insertOrUpdate(c);
    }
}
