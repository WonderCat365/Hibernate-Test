/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfirstproject.entities;

/**
 *
 * @author wondercat
 */
public class User {

    private int id;
    private String name;
    private String position;
    private int salary;
    private String surname;

    public User(int id, String name, String position, int salary, String surname) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.surname = surname;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", surname=" + surname + '}';
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
