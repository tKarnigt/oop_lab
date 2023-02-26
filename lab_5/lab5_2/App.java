package com.company;
public class App
{
    public static void main(String[] args) throws Exception {
        com.company.RegularPolygon polygon = new com.company.RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter: " + polygon.getPerimeter());
        System.out.printf("Area: %.2f",polygon.getArea());
    }
}
