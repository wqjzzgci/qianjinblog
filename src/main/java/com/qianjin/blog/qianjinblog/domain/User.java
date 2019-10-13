package com.qianjin.blog.qianjinblog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
    public  User(Long id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    protected User(){//防止直接使用

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    private String name;
    private String email;
    @Override
    public String toString(){
        return String.format("User[id=%d,name='%s',email='%s']",id,name,email);
    }
}
