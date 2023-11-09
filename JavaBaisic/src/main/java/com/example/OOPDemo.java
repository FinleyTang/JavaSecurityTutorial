package com.example;

public class OOPDemo {
    public  static  void main(String args[]){
        Circle c1 = new Circle();
        System.out.println(c1.getArea());

        Circle c2 = new Circle(1.0);
        System.out.println(c2.getArea());
        System.out.println(c2.getColor());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3.getColor());
        System.out.println(c3.getArea());

        c3.setColor("yellow");
        System.out.println(c3.getColor());

    }
}
