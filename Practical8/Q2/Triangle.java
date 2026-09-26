package Practical8.Q2;

public class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    void Area(){
        System.out.println("Triangle");
        System.out.println("Base : "+base+" Height : "+height);
        System.out.println("Area : "+0.5*base*height);
    }
}
