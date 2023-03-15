/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class BancoDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Agenda2PU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void insertOrUpdate(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
    }
    public void remove(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
    }
     public List list(String nomeClasse){
       return em.createQuery("select o from "+nomeClasse+" o ").getResultList();
       
   }
    
}
