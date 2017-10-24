package dao;

import entity.User;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

/**
* @author benchenshao
* @create 2017/10/24 13:54
* @desc
*/
public class UserDao {
    EntityManagerFactory entityManagerFactory = JpaUtil.getFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    /**
     * 录入新用户信息
     * @param user
     */
    public void register(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public boolean login(String username,String password) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select u from User u where u.username=:username and u.password=:password");
        query.setParameter("username",username);
        query.setParameter("password",password);
        List<User> list = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        if (list.size() > 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
