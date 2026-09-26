package Practical8.Q2;

public class Rectangle extends Shape{
double breadth;
double length;
Rectangle(double breadth,double length){
    this.breadth = breadth;
    this.length = length;
}
void Area(){
    System.out.println("Rectangle");
    System.out.println("Length : "+length+" Breadth : "+breadth);
    System.out.println("Area : "+length*breadth);
}
}
