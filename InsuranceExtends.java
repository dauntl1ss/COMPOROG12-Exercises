public class InsuranceExtends{
  private int currentYear;
  private int birthYear;
  
  public void setBirthYear(int birth){
  birthYear = birth;
  }
  public void setCurrentYear(int current){
  currentYear = current;
  }
  public int getAge(){
  return currentYear - birthYear;
  }
  public int getDecades(){
  return getAge()/10;
  }
  public int premium(){
  return (getDecades() + 15)  * 20;
  }
  
}