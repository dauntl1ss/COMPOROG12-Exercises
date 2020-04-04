/*this is an extended class 
for PaintCalculator.java*/
class Area{
   private double area;
   private double l;
   private double w;
   private double h;
   private double getNoOfGallons; 
   
   public void setLength(double length){
      l = length;
   }
   public void setWidth(double width){
      w = width;
   }
   public void setHeight(double height){
      h = height;
   }
   public void setGallonsNeeded(double length, double width, double height){
   double area;
   area = 2 *(length + width) * height;
   getNoOfGallons = area/350;
   }
   public double getArea(){
      double wallArea;
      wallArea = 2*(l+w)*h;
      return wallArea;
   }
   public double getPaintPrice(){
      return getNoOfGallons*32;
   }
  

   
}   
   



