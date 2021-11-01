package com.example.lkproje.HelloWorld.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer ID;
    private String name;
    private Date world_date;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getWorld_date() {
        return world_date;
    }

    public void setWorld_date(Date world_date) {
        this.world_date = world_date;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", world_date=" + world_date +
                '}';
    }

    public User(Integer ID, String name, Date world_date) {
        this.ID = ID;
        this.name = name;
        this.world_date = world_date;
    }
}
