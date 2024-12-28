package javaproject;

class Person01 {
    private String name;
    private int age;

    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Call to super class constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, 101, 50000.0);
        emp.display();
    }
}