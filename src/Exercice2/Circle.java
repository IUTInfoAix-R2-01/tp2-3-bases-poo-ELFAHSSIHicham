package Exercice2;

public class Circle {
	
	private double radius;
	private String color;
	   
	  
	   public Circle() {  
	      this.radius = 1.0;
	      this.color = "red";
	   }
	   
	   public Circle(double radius) {  
	      this.radius = radius;
	      this.color = "red";
	   }
	   
	   
	   
	   public double getRadius() {
	     return radius; 
	   }
	   
	   
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   public String getColor() { 
		   return this.color;
	   }
	   
	   public void setRadius(double Radius) {
		   this.radius = Radius;
		}
	   
	   public void setColor(String newColor) { 
		   this.color = newColor;
	   }
	   public String toString() {
		   return "Circle[radius=" + radius + " color=" + color + "]";
		}

}

   