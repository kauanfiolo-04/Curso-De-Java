package app;

import domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    static void main() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin(); // 1. Inicia a transação

            Pessoa p = em.find(Pessoa.class, 2);

            em.remove(p);

            em.getTransaction().commit(); // 2. Faz o commit

            System.out.println(p);

            System.out.println("Pronto!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Desfaz em caso de erro
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
