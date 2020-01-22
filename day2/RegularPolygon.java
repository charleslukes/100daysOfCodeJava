
package day2;

/**
 * QUESTION
 * 
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
 * have the same length and all angles have the same degree (i.e., the polygon
 * is both equilateral and equiangular). Design a class named RegularPolygon
 * that contains: A private int data field named n that defines the number of
 * sides in the polygon with default value 3. A private double data field named
 * side that stores the length of the side with default value 1. A private
 * double data field named x that defines the x-coordinate of the polygon’s
 * center with default value 0. A private double data field named y that defines
 * the y-coordinate of the poly- gon’s center with default value 0. A no-arg
 * constructor that creates a regular polygon with default values. A constructor
 * that creates a regular polygon with the specified number of sides and length
 * of side, centered at (0, 0). A constructor that creates a regular polygon
 * with the specified number of sides, length of side, and x and y-coordinates.
 * 
 * The accessor and mutator methods for all data fields. The method
 * getPerimeter() that returns the perimeter of the polygon. The method
 * getArea() that returns the area of the polygon.
 * 
 * Implement the class. Write a test program that creates three RegularPolygon
 * objects, created using the no-arg constructor, using RegularPolygon(6, 4),
 * and using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its
 * perimeter and area.
 */

public class RegularPolygon {
    private int n = 3;
    private double polygonLength = 1;

    // coordinates x and y from the center
    private double x = 0;
    private double y = 0;

    public static void main(String[] args) {

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // display the perimeter and area of polygons
        System.out.println("Polygon 1: Perimer = " + polygon1.getPerimeter() + " Area = " + polygon1.getArea());
        System.out.println("Polygon 1: Perimer = " + polygon2.getPerimeter() + " Area = " + polygon2.getArea());
        System.out.println("Polygon 1: Perimer = " + polygon3.getPerimeter() + " Area = " + polygon3.getArea());

    }

    // default constructor
    RegularPolygon() {
    }

    // overloaded constructor with number of sides and length of sides
    RegularPolygon(int numberOfSides, double length) {
        this.n = numberOfSides;
        this.polygonLength = length;
    }

    // overloaded constructor with number of sides and length of sides with x and y
    // coordinates
    RegularPolygon(int numberOfSides, double length, double x, double y) {
        this.n = numberOfSides;
        this.polygonLength = length;
        this.x = x;
        this.y = y;
    }

    private double getPerimeter() {
        return n * polygonLength;
    }

    private double getArea() {
        return (this.n * this.polygonLength * this.polygonLength) / (4.0 * Math.tan(Math.PI / this.n));
    }

    public int getNumberOfSides() {
        return n;
    }

    public void setNumberOfSides(int newNumber) {
        this.n = newNumber;
    }

    public double getLengthOfPolygon() {
        return polygonLength;
    }

    public void setLengthOfPolygon(double newLength) {
        this.polygonLength = newLength;
    }

    public double getX() {
        return x;
    }

    public void setX(double newX) {
        this.x = newX;
    }

    public double getY() {
        return y;
    }

    public void setY(double newY) {
        this.y = newY;
    }

}