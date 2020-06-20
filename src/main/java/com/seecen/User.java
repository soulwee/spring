package com.seecen;

import org.springframework.context.annotation.Bean;

import java.util.*;

public class User {
    private String userName;
    private int age;
    private String say;
    private User wife;
    private List<String> dogs=new ArrayList<>();
    private Set<String> books=new HashSet<>();
    private Map<String,String> laogong=new HashMap<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public User getWife() {
        return wife;
    }

    public void setWife(User wife) {
        this.wife = wife;
    }

    public List<String> getDogs() {
        return dogs;
    }

    public void setDogs(List<String> dogs) {
        this.dogs = dogs;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    public Map<String, String> getLaogong() {
        return laogong;
    }

    public void setLaogong(Map<String, String> laogong) {
        this.laogong = laogong;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getSay() {
        return say;
    }
    public void show(){
        System.out.println("我的名字是:"+userName+"说:"+say);
    }
}
