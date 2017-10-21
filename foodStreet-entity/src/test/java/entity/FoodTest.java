package entity;

import org.junit.Test;

public class FoodTest {
    @Test
    public void test(){
        Food food = new Food();

        food.setName("zss");
        food.setPrice(20);
        food.setSite("湖南长沙");
        food.setTaste("香辣");

        System.out.println(food.toString());
    }
}
