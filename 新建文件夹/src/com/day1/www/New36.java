package com.day1.www;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class New36 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        Model m1 = new Model("高", "1");
        Model m2 = new Model("张", "2");
        Model m3 = new Model("高", "1");
        c.add(m1);
        c.add(m2);
        c.add(m3);
        System.out.println(c);
    }
}
    class Model {
    String  name;
    String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Model(String name, String id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Mldel{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Model model = (Model) o;
            return name.equals(model.name) &&
                    id.equals(model.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }
    }
