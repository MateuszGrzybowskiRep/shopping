/*

package domain;

import com.websystique.springmvc.dao.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Category employee = new Category();
        employee.setFirstName("janek");
        employee.setLastName("dupa");



        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }
}
*/
