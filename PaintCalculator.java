import java.util.*;
import java.io.*;
class PaintCalculator{
   static Scanner console = new Scanner(System.in);
   public static void main(String[] args){
      
      double length, width, height;
      System.out.println("Enter the length: ");
      length = console.nextDouble();
      System.out.println("Enter the width: ");
      width = console.nextDouble();
      System.out.println("Enter the height: ");
      height = console.nextDouble();
      
      Area x = new Area();
      Area.setLength(length);
      Area.setWidth(width);
      Area.setHeight(height);
      Area.setGallonsNeeded(length, width, height);
      System.out.print("The cost to a " + (int)length + "-by-" + (int)width + "-foot room with " + (int)height +"-foot cellings is ");
      System.out.printf("$%.2f",Area.getPaintPrice());
        
   }
}
class Area{
   public double area;
   public static double l;
   public static double w;
   public static double h;
   public static double getNoOfGallons; 
   
   public static void setLength(double length){
      l = length;
   }
   public static  void setWidth(double width){
      w = width;
   }
   public static void setHeight(double height){
      h = height;
   }
   public static void setGallonsNeeded(double length, double width, double height){
      double area;
      area = 2 *(length + width) * height;
      getNoOfGallons = area/350;
   }
   public static double getArea(){
      double wallArea;
      wallArea = 2*(l+w)*h;
      return wallArea;
   }
   public static double getPaintPrice(){
      return getNoOfGallons*32;
   }
   
}
   



