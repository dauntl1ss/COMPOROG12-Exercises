class Walk{
   public static void main(String[] args){
   int walkAndPrep = 40; //total mins for walk and preparation
   int hourSet = 9;//expected time
   int hoursToMinutes = 540; //no. of minutes in 9 hours
   int minutesInHour = 60;//no. of minutes in an hour
   int minutesInADay = 1440;//no. of minutes in a day
  System.out.print((hoursToMinutes-20)/minutesInHour+ ":");//Display hour
  System.out.print((minutesInADay/24)-walkAndPrep + "AM");//Display minutes.
   }
}