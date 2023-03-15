/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package banco;

import Model.Contato;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laboratorio
 */
public class BancoDAOTest {
    
    @Test
    public void testInstert(){
        BancoDAO banco = new BancoDAO();
        Contato c = new Contato();
        c.setNome("Andre");
        banco.insertOrUpdate(c);
    }

    /**
     * Test of remove method, of class BancoDAO.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object o = null;
        BancoDAO instance = new BancoDAO();
        instance.remove(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class BancoDAO.
     */
    @Test
    public void testList() {
        System.out.println("list");
        String nomeClasse = "";
        BancoDAO instance = new BancoDAO();
        List expResult = null;
        List result = instance.list(nomeClasse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
