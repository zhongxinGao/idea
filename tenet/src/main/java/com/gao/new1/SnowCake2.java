package com.gao.new1;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2020-01-01 20:53
 * ​
 **/
public class SnowCake2 extends SnowCake {
    public SnowCake2(Integer id, String taste, Double price) {
        super(id, taste, price);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public String getTaste() {
        return super.getTaste();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    @Override
    public String toString() {
return "SnowCake{"+
        "id="+ super.getId()+
        "，taste='"+super.getTaste()+'\''+
        ",price=" +super.getPrice()*0.8 +
        '}';
    }
}
