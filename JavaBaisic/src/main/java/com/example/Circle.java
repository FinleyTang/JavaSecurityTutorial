package com.example;

public class Circle {
    private  double radius;
    private  String  color;

    public  Circle(){
        radius = 2.0;
        color = "red";
    }

    public  Circle(double r){
        radius = r;
        color = "red";
    }

    public  Circle(double r, String c){
        radius = r;
        color = c;
    }

    public double getRadius(){return  radius;}

    public String getColor(){return color;}

    public double getArea(){return 3.14*radius*radius;}

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
