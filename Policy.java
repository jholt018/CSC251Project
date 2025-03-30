public class Policy{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private int smokingStatus;
   private double height;
   private double weight;
   //no arg constructor
   public void Policy(){
      policyNumber = 0;
      providerName = ("");
      firstName = ("");
      lastName = ("");
      age = 0;
      smokingStatus = 0;
      height = 0;
      weight = 0;
   }//end no arg constructor
   //constructor that accepts arguments
   public void Policy(int policy, String provider, String first, String last, int a, int smoking, double h, double w){
      policyNumber = policy;
      providerName = provider;
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = smoking;
      height = h;
      weight = w;

   }//end contructor method with arguments
   
   //setPolicyNumber method
   public void setPolicyNumber(int policy){
      policyNumber = policy;
   }//end setPolicyNumber method
   
   //setProviderName method
   public void setProviderName(String provider){
      providerName = provider;
   }//end setProviderName method
   
   //setFirstName method
   public void setFirstName(String first){
      firstName = first;
   }//end setFirstName method
   
   //setLastName method
   public void setLastName(String last){
      lastName = last;
   }//end setLastName method
   
   //setAge method
   public void setAge(int a){
      age = a;
   }//end setAge method
   
   //setSmokingStatus method
   public void setSmokingStatus(int smoking){
      smokingStatus = smoking;
   }//end setSmokingStatus method
   
   //setHeight method
   public void setHeight(double h){
      height = h;
   }//end setHeight method
   
   //setWeight method
   public void setWeight(double w){
      weight = w;
   }//end setWeight method
   
   //getPolicyNumber method
   public int getPolicyNumber(){
      return policyNumber;
   }//end getPolicyNumber method
   
   //getProviderName method
   public String getProviderName(){
      return providerName;
   }//end getProviderName method
   
   //getFirstName method
   public String getFirstName(){
      return firstName;
   }//end getFirstName method
   
   //getLastName method
   public String getLastName(){
      return lastName;
   }//end getLastName method
   
   //getAge method
   public int getAge(){
      return age;
   }//end getAge method
   
   //getSmokingStatus method
   public int getSmokingStatus(){
      return smokingStatus;
   }//end getSmokingStatus method
   
   //getHeight method
   public double getHeight(){
      return height;
   }//end getHeight method
   
   //getWeight method
   public double getWeight(){
      return weight;
   }//end getWeight method
   
   public double calculateBMI(){
   double BMI = (weight * 703)/(height^2);
   return BMI;
   }
   
   public double calculatePrice(){
      double basePrice = 600.00;
      if(age > 50)
         price = basePrice + 75.00;
      else
         price = basePrice
      if(smokingStatus == 1){
            price = price + 100.00;
         }
      else
         price = price;
      if(BMI > 35){
         price = price + ((BMI-35) * 20);
      else
         price  = price
      }
   }










   
}//end Policy class