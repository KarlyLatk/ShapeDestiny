package org.example;

public class RightTriangle extends Shape{
    private double length;
    private double width;

    public RightTriangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return 0.5 * length * width;
    }
    @Override
    public double getPerimeter(){
        return length + width + (Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)));
    }
}
