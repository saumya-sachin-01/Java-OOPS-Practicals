package Practical8.Q2;

public class Circle extends Shape{
double radius;
Circle(double radius){
    this.radius=radius;
}
void Area(){
    System.out.println("Circle");
    System.out.println("Radius = "+radius);
    System.out.println("Area = "+(3.14*radius*radius));
}
}
