package com.example.db_boot_three.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cendentials {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cendentials(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public Cendentials() {
    }

    @Override
    public String toString() {
        return "Cendentials [id=" + id + ", password=" + password + "]";
    }

}
