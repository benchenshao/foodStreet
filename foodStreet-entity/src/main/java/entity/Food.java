package entity;

import javax.persistence.*;

/**
 * @author benchenshao
 */
@Entity
@Table(name = "FOOD")
public class Food {
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
