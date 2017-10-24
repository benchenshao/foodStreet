package dao;

import entity.Food;
import org.junit.Test;

import java.util.List;

public class FoodDaoTest {
    @Test
    public void daoInsertTest() {
        FoodDao foodDao = new FoodDao();
        Food food = new Food();
        food.setName("大闸蟹");
        food.setPrice(20.00);
        food.setSite("阳澄湖");
        food.setTaste("微辣");
        foodDao.insertFood(food);
        System.out.println(food);
    }
    /*@Test
    public void daoDeleteTest() {
        FoodDao foodDao = new FoodDao();
        foodDao.deleteFood(1);

    }

    @Test
    public void daoUpdateTest() {
        FoodDao foodDao = new FoodDao();
        Food food = new Food();
        food.setId(2);
        food.setName("pLL");
        food.setSite("ss");
        food.setPrice(20);
        food.setTaste("香辣");

        foodDao.updateFood(food);
    }

    @Test
    public void daoQueryAllTest() {
        FoodDao foodDao = new FoodDao();
        List<Food> list = foodDao.queryAllFood();
        System.out.println(list);
        for (Food f :
                list) {
            System.out.println(f.toString());
        }
    }*/

}
