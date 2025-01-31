package Exercice3;

public class Rectangle {
	
	
	private  float length;
	private float width;
	
	 public Rectangle() {  
	      this.length = 1.0f;
	      this.width = 1.0f;
	   }
	 
	 public Rectangle(float length, float widht) {  
	      this.length = length;
	      this.width = widht;
	   }
	   
	 public float getLength() {
	     return length; 
	   }
	 
	 public float getPerimeter() {
	      return 2*length + 2*width;
	   }
	 public float getArea() {
	      return length*width;
	   }
	 
	 public float getWidth() { 
		   return this.width;
	   }
	 
	 
	  public void setLength(float Length) {
		   this.length = Length;
		}
	   
	   public void setWidth(float newWidth) { 
		   this.width = newWidth;
	   }
	   public String toString() {
		   return "Rectangle[length=" + length + " width=" + width + "]";
		}

}
