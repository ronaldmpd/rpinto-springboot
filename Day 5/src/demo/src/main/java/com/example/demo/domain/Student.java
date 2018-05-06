package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Student {

    @Id
    //@Transient
    private  String id;
    private long codSis;
    private  String name;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCodSis() {
        return codSis;
    }

    public void setCodSis(long codSis) {
        this.codSis = codSis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
