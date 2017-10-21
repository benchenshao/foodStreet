package util;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JPAUtilTest {
    @Test
    public void test(){
        EntityManagerFactory factory = JpaUtil.getFactory();
        EntityManager entityManager = factory.createEntityManager();

        System.out.println(factory);
        System.out.println(entityManager);
    }
}
