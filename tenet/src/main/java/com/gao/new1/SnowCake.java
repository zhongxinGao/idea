package com.gao.new1;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2020-01-01 16:47
 * ​
 **/
public class SnowCake implements ICake {
    private Integer id;
    private String taste;
    private Double price;

    public SnowCake(Integer id, String taste, Double price) {
        this.id = id;
        this.taste = taste;
        this.price = price;
    }
    public Integer getId(){
        return this.id;
    }
    public String getTaste(){
        return this.taste;
    }
    public Double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "SnowCake{" +
                "id=" + id +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
