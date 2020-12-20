package com.company.GB4;

public class Main {

    public static void main(String[] args) {
        Employee [] empArray = new Employee[5];

        empArray[0]= new Employee("Pavel", "manager", "pavel@ya.ru", "89991234567", 39000.4, 43);
        empArray[1]= new Employee("Petr", "ceo", "petr@ya.ru", "89991234547", 80000, 45);
        empArray[2]= new Employee("Dan", "seller", "petr@ya.ru", "89461234547", 20000, 28);
        empArray[3]= new Employee("Leo", "programmer", "petr@ya.ru", "89452345647", 800000.6, 20);
        empArray[4]= new Employee("Max", "designer", "petr@ya.ru", "89541235647", 100000, 23);

        for (Employee employee : empArray) {
            if (employee.age >= 40) employee.info();
        }
    }
}
