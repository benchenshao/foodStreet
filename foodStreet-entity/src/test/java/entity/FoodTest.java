package entity;

import org.junit.Test;

public class FoodTest {
    @Test
    public void test(){
        Food food = new Food();

        food.setId(1);
        food.setName("zss");
        food.setPrice(20);
        food.setSite("湖南长沙");
        food.setTaste("香辣");

        Food food1 = new Food();

        food.setId(2);
        food1.setName("zss");
        food1.setPrice(20);
        food1.setSite("湖南长沙");
        food1.setTaste("香辣");

        System.out.println(food.toString());
        System.out.println(food1.toString());
    }
}
