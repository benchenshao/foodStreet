package dao;

import entity.Food;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

/**
 * @author benchenshao
 */
public class FoodDao {

    private static EntityManagerFactory factory = JpaUtil.getFactory();
    EntityManager entityManager = factory.createEntityManager();


    /**
     * @param food
     * 添加美食
     */
    public void insertFood(Food food) {
        entityManager.getTransaction().begin();
        entityManager.persist(food);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    /**
     * @param id
     * 删除美食
     */
    public void deleteFood(int id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Food.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    /**
     * @param food
     * 修改美食
     */
    public void updateFood(Food food) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update Food f set f.name=:name,f.site=:site,f.price=:price,f.taste=:taste where f.id=:id");
        query.setParameter("id", food.getId());
        query.setParameter("name", food.getName());
        query.setParameter("site", food.getSite());
        query.setParameter("price", food.getPrice());
        query.setParameter("taste", food.getTaste());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    /**
     * @return
     * 查询全部学生
     */
    public List<Food> queryAllFood() {
        List<Food> list = entityManager.createQuery("from Food").getResultList();

        return list;
    }

}
