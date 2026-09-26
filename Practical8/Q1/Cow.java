package Practical8.Q1;

public class Cow extends Animal {
    String name;
    int age;
    Cow(String name,int age){
        this.age=age;
        this.name=name;
    }
   public void sound(){
       System.out.println("Name = "+this.name+" Age = "+this.age);
        System.out.println("Cow : Moo");
    }
}
