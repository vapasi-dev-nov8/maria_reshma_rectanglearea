package com.shapes;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }


    public double area() {
        return getSide() * getSide();
    }

    public double perimeter() {
        return 4 * getSide();
    }
}
