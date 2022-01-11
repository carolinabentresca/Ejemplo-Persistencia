package ejemplopersistencia;

import Entity.Producto1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EjemploPersistencia {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploPersistenciaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        //Insertamos un nuevo Producto 
        Producto1 producto = new Producto1();
        producto.setId(113);
        producto.setMarca("CHEVROLET");
        producto.setModelo("JOY PLUS");
        producto.setColor("SUMMIT WHITE");
        producto.setPrecio(1858900.0);
        producto.setCuota(20800.0);
        em.persist(producto);
        
         et.commit();
    }

}
