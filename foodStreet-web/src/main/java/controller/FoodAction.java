package controller;

import dao.FoodDao;
import entity.Food;

import java.util.List;

/**
 * @author benchenshao
 */
public class FoodAction {
    /**
     * 美食编号
     */
    private int id;
    /**
     * 美食名字
     */
    private String name;
    /**
     * 美食的产地
     */
    private String site;
    /**
     * 美食的价格
     */
    private double price;
    /**
     * 美食的口味
     */
    private String taste;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    Food food = new Food();
    FoodDao foodDao = new FoodDao();

    //添加美食
    public String insertFood() {
        food.setName(name);
        food.setSite(site);
        food.setPrice(price);
        food.setTaste(taste);

        foodDao.insertFood(food);
        return "insertFood" ;
    }

    //删除美食
    public String deleteFood() {
        foodDao.deleteFood(id);
        return "deleteFood";
    }

    //修改美食
    public String updateFood() {
        food.setId(id);
        food.setName(name);
        food.setSite(site);
        food.setPrice(price);
        food.setTaste(taste);

        foodDao.updateFood(food);
        return "updateFood";
    }

    public String queryAllFood() {
        List<Food> list = foodDao.queryAllFood();
       // ValueStack vs =

        return "queryAllFood";
    }
}
