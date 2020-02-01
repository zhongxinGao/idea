package com.mapper;

import com.bean.Animal;

import java.util.List;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-09 13:55
 * ​maper接口增删查改
 **/
public interface AnimalMapper {
    //增加
    public void insertAnimal(Animal animal);
    //根据id删除
    public void deleteAnimal(int id);
    //查询所有
    public List<Animal> animalAll();
    //根据id修改
    public  void updateAnimal(Animal animal);
}
