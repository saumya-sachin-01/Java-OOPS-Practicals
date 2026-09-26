package Practical8.Q1;

public class Cat extends Animal {
    String name;
    int age;
    Cat(String name,int age){
        this.age=age;
        this.name=name;
    }
    @Override
 public void sound(){
        System.out.println("Name = "+this.name+" Age = "+this.age);
        System.out.println("Cat : Meow");
    }
}
