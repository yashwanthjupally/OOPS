package lec2_Packages;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    //the properties doesnt directly related to objects are called static variables or methods
// ex population,it is independent of object




}
