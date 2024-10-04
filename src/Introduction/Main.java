package Introduction;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        store 5 roll nos-
        int[] nums = new int[5];

//        store 5 names
        String[] names = new String[5];

//        data of 5 students include roll_no, marks, name
        int[] roll = new int[5];
        float[] marks = new float[5];
        String[] name = new String[5];

//        some sort of data structure which contains roll_no, marks, name
//        i.e. class combining all these entities in your own datatype

        Student[] students = new Student[5]; //Student is our own datatype
        System.out.println(Arrays.toString(students));

        // consists of three above properties
        Student student1;    //declared the object in stack memory but has no value. compile time
        student1 = new Student(); // creates an object. // run time
        // new keyword dynamically allocates memory and returns the reference to it(student1)
//        Student student1 = new Student();
        System.out.println(student1);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println(student1.roll);

//        student1.name = "Yashwanth";
//        student1.marks = 82;
//        student1.roll = 20;

        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println(student1.roll);


        //constructor


    }

//    creates a class for every single student

    static class Student{
        int roll;
        float marks;
        String name;

        //constructor
        Student(){
            this.name = "Yashwanth";
            this.roll = 21;
            this.marks = 80;
        }

        Student(int rol, String name, float marks){
            this.roll = rol;
            this.name = name;
            this.marks = marks;
        }
    }

}

    // this class is template for group of properties

/*
*  Car contains engine, seats, price using these properties as template
*  Car class contains objects like Maruthi, Ferrari, Audi, Mahindra which contains
* the properties of class with differ values each.
*
* class Car{
*   int price;
*   int seats;
*   String engine;
* }
*
* car class contains different objects like
*
* Car Audi = new car(){
*   price = 40000;
*   seats = 6;
*   engine = petrol;
* }
*
*
* */
//    class is a logical construct, and object is physical reality
//    which occupies some space in memory
//    the variables inside the object is known as Instance variables

//    "." operator is used to link the value of instance variables to reference object
//      ex
//      Audi.price = 40000
//
//

