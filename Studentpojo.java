package Streams;

import java.io.Serializable;

public class Studentpojo implements Serializable {
    Integer id;
    String name;
    public Studentpojo(int id,String name){
        this.id=id;
        this.name=name;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
