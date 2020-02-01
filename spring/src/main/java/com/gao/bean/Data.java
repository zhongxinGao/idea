package com.gao.bean;

import java.util.*;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-07 20:52
 * ​
 **/
public class Data {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Data{" +
                "properties=" + properties +
                '}';
    }
}
