import java.util.*;
import java.io.*;
class MetricConversion{
   static Scanner console = new Scanner(System.in);
   public static void main(String[] args){
      
      int input;
      input = console.nextInt();
      
      litersAndCm x = new litersAndCm();
      x.setInches(input);
      x.setGallons(input);
      
      System.out.println(x.getInches());
      System.out.print(x.getGallons());
   }
}
class litersAndCm{
   private int inches;
   private int centimeters;
   private int gallons;
   private int liters;
 
 public void setInches(int inch){
   inches = inch;
 }
 public void setGallons(int gallon){
 gallons = gallon;
 }
 public double getInches(){
 double inchesToCm;
 inchesToCm = inches * 2.54;
 System.out.println("inches to cm: ");
 return inchesToCm;
 }
 
 public double getGallons(){
 double gallonsToLiters;
 gallonsToLiters = gallons * 3.7854;
  System.out.println("gallons to liters: ");
 return gallonsToLiters;
 }
   
 
}