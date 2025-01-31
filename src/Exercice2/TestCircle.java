package Exercice2;

public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare an instance of Circle class called c1.
      // Construct the instance c1 by invoking the "default" constructor
      
      Circle c1 = new Circle();
      
      System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
      
   
      // Declare an instance of class circle called c2.
      // Construct the instance c2 by invoking the second constructor
      
      Circle c2 = new Circle(2.0);
      
      System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
      
   }
}