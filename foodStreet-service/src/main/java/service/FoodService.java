package service;

import dao.FoodDao;
import entity.Food;

import java.util.List;

/**
 * @author benchenshao
 */
public class FoodService {
    FoodDao foodDao = new FoodDao();

    /**
     * @param food
     * 添加美食
     */
    public void insertFood(Food food) {
        foodDao.insertFood(food);
    }

    /**
     * @param id
     * 删除美食
     */
    public void deleteFood(int id) {
        foodDao.deleteFood(id);
    }

    /**
     * @param food
     * 修改美食
     */
    public void updateFood(Food food) {
        foodDao.updateFood(food);
    }


    /**
     * @return
     * 查询全部美食
     */
    public List<Food> queryAll() {
        List<Food> list = foodDao.queryAllFood();
        return list;
    }
}
