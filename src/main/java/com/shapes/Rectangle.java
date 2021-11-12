package com.shapes;

public class Rectangle {

    private double width;
    private double breadth;

    public Rectangle(double width, double breadth) {
        this.width = width;
        this.breadth = breadth;
    }

    public void setWidth(Double width){
        this.width = width;
    }

    public void setBreadth(Double breadth){
        this.breadth = breadth;
    }

    public double getWidth(){
        return this.width;
    }

    public double getBreadth(){
        return this.breadth;
    }

    public double area() {
        return getWidth() * getBreadth();
    }

    public double perimeter() {
        return 2 * (getBreadth() + getWidth());
    }
}
