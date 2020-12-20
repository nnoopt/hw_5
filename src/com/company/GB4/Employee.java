package com.company.GB4;

public class Employee {

    String name;
    String position;
    String email;
    String tel;
    double salary;
    int age;

    public Employee (String name, String position, String email, String tel, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    public void info (){
        System.out.println("Имя: " + name + ". Должность: " + position + ". Почта: " + email + ". Телефон: " + tel + ". ЗП: " +  salary + ". Возраст: " + age);
    }
}
