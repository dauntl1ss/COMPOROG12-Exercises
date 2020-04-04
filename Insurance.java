import java.util.*;
public class Insurance{
   static Scanner console = new Scanner(System.in);
   public static void main(String[] args){
   
   int current, birthyear;
   System.out.println("Enter current year: ");
   current = console.nextInt();
   System.out.println("Enter birth year: ");
   birthyear = console.nextInt();
   
   InsuranceExtends x = new InsuranceExtends();
   x.setCurrentYear(current);
   x.setBirthYear(birthyear);
   System.out.println("Premium Amount: $");
   System.out.print(x.premium());
   
   }
}