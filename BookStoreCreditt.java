import java.io.*;
import java.util.*;
class BookStoreCreditt{
static Scanner console = new Scanner(System.in);
public static void main(String[] args){
   System.out.print("Enter your name: ");
      String name = console.nextLine();
   System.out.print("Enter your grade: ");
      double grade = console.nextDouble();
      
      BookStoreCredit x = new BookStoreCredit();
      x.setName(name);
      x.setGrade(grade);
      
      System.out.println("Hi, "+ x.getName());
      System.out.println("Your BookStore Credit is: $" + String.format("%.2f",x.getGrade()));
      
 }
}
class BookStoreCredit{
   private String name;
   private double average;
   
   public void setName(String passName){
   name = passName;
 }   
   public void setGrade(double passAverage){
   average = passAverage * 10;
   }
      
   public String getName(){
      return name;
   }
   
   public double getGrade(){
      return average;
   }
      
}