package com.gao.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 9:37
 * ​集合注入
 **/
public class Collection {
    private String[] arrs;
    private List<String> lists;
    private Set<String> sets;
    private Map<String, String> maps;

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "arrs=" + Arrays.toString(arrs) +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                '}';
    }
}
