package br.com.ebac.jpaavancado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) throws Exception {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-avancado");

        EntityManager em = emf.createEntityManager();

        System.out.println("BANCO CRIADO - pressione ENTER para finalizar");
        System.in.read();

        em.close();
        emf.close();
    }
}
