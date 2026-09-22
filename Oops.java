
import java.util.*;

public class Oops {
 
  
 /* 
// Parent class
static class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1
static class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
static class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public static void main(String args[]) {
    Dog d = new Dog();
    d.eat();   
    d.bark();  

    Cat c = new Cat();
    c.eat();   
    c.meow();  
}
}
*/
/* 
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
       // p1.setColor("yellow");
        p1.setColor ("yellow");
         System.out.println(p1.getColor());

    }
}
class pen{
     private String color;
      private int tip;


    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
       this.tip = tip;
    }
}
*/
/* 
 
// Parent class
 static class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Friendly {
    void behave();
}

// Child class inheriting class + interfaces
 static class Dog extends Animal implements Pet, Friendly {

    public void play() {
        System.out.println("Dog is playing");
    }

    public void behave() {
        System.out.println("Dog is friendly");
    }
}


    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.behave();
    }
}
    */

/* 
public static void main(String args[]){
Deer d = new Deer();
d.eat();
}
}
    class Animal{
        void eat(){
            System.out.println("eat anything");
        }

    }
    class Deer extends Animal{
        void eat(){
            System.out.println("eats grass");
        }
    }
        */
     /* public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
       }
    }
    abstract class Animal{
        void eat(){
            System.out.println("animal eats");
        }
        abstract void walk();
    }

    class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    }
    class Chicken extends Animal{
        void walk(){
            System.out.println("walks on 2 legs");
        }
    }

 */
/*  public static void main(String args[]){
    Student s1 = new Student();
    s1.schoolName = "JMW";

    Student s2 = new Student();
    System.out.println(s2.schoolName);

    Student s3 = new Student();
    s3.schoolName = "ABC";
 System.out.println(s3.schoolName);

 }

 }

    class Student {
        String name;
        int roll;

        static String schoolName;

        void setName(String name){
            this.name = name;
        }
        String getName(){
            return this.name;
        }
    }
    */

    // super keyword //

    public static  void main(String args[]){
        Horse h = new Horse();

    }
}

    class Animal{
        Animal(){
            System.out.println("animal constructor is called");
        }
    }
    class Horse extends Animal{
        Horse(){
            super();
            System.out.println("horse constructor is called");
        }
    }
  







