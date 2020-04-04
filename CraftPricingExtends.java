public class CraftPricingExtends{
private String name;
private double cost, hours;

public void setName(String material){
name = material;
}
public void setCost(double materialCost){
cost = materialCost;
}
public void setHours(double workingHours){
hours = workingHours;
}
public String getName(){
return name;
}
public double getRetailPrice(){
return cost + 12 * hours;
}


}