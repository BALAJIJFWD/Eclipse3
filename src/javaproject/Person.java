package javaproject;

class Person {
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.age = 18;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();

        Person person2 = new Person("John", 25);
        person2.display();
    }
}