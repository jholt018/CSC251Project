public class Policy{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   //no arg constructor
   /** 
      no argument constructor class
   */
   public Policy(){
      policyNumber = 0;
      providerName = (" ");
      firstName = (" ");
      lastName = (" ");
      age = 0;
      smokingStatus = (" ");
      height = 0.00;
      weight = 0.00;
   }//end no arg constructor
   
   //constructor that accepts arguments
   /** 
      with argument constructor class
      @param policy policy number
      @param provider providers name
      @param first policyholder first name
      @param last policyholder last name
      @param a policyholder age
      @param smoking policyholder smoking status
      @param  h policyholder height
      @param w policyholder weight
   */

   public Policy(int policy, String provider, String first, String last, int a, String smoking, double h, double w){
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
   /**
      method that sets policy number
      @param policy policy number.
   */
   public void setPolicyNumber(int policy){
      policyNumber = policy;
   }//end setPolicyNumber method
     
   //setProviderName method
    /**
    method that sets name
      @param provider provider name
   */

   public void setProviderName(String provider){
      providerName = provider;
   }//end setProviderName method
   
   //setFirstName method
   /**
      method that sets first name
      @param first policyholder first name
   */
   public void setFirstName(String first){
      firstName = first;
   }//end setFirstName method
   
   //setLastName method
   /**
      method that sets last name
      @param last policyholder last name
   */
   public void setLastName(String last){
      lastName = last;
   }//end setLastName method
   
   //setAge method
   /**
      method that sets age
      @param a policyholder age
   */
   public void setAge(int a){
      age = a;
   }//end setAge method
   
   //setSmokingStatus method
   /**
      method that sets smoking status
      @param smoking policyholder smoking status
   */
   public void setSmokingStatus(String smoking){
      smokingStatus = smoking;
   }//end setSmokingStatus method
   
   //setHeight method
   /**
      method that sets policyholder height
      @param h policyholder height
   */
   public void setHeight(double h){
      height = h;
   }//end setHeight method
   
   //setWeight method
   /**
      method that sets weight
      @param w policyholder weight
   */
   public void setWeight(double w){
      weight = w;
   }//end setWeight method
   
   //getPolicyNumber method
   /**
      method that gets policy number
      @return the policy number 
   */
   public int getPolicyNumber(){
      return policyNumber;
   }//end getPolicyNumber method
   
   //getProviderName method
   /**
      method that gets provider name
      @return the provider name 
   */

   public String getProviderName(){
      return providerName;
   }//end getProviderName method
   
   //getFirstName method
   /**
      method that gets first name
      @return the first name of the policyholder 
   */

   public String getFirstName(){
      return firstName;
   }//end getFirstName method
   
   //getLastName method
   /**
      method that gets last name
      @return the policyholder last name 
   */

   public String getLastName(){
      return lastName;
   }//end getLastName method
   
   //getAge method
   /**
      method that gets age
      @return the policyholder's age 
   */

   public int getAge(){
      return age;
   }//end getAge method
   
   //getSmokingStatus method
   /**
      method that gets smoking status
      @return the policyholder's smoking status 
   */

   public String getSmokingStatus(){
      return smokingStatus;
   }//end getSmokingStatus method
   
   //getHeight method
   /**
      method that gets height
      @return the policyholders's height 
   */

   public double getHeight(){
      return height;
   }//end getHeight method
   
   //getWeight method
   /**
      method that gets weight
      @return the policyholders's weight 
   */

   public double getWeight(){
      return weight;
   }//end getWeight method
   
   /**
      method that gets BMI
      @return BMI of policyholder
   */
   
   public double getBMI(){
   double BMI = (weight * 703)/(height * height);
   return BMI;
   }
   /**
      method that gets price
      @return price
   */
   public double getPrice(){
      double basePrice = 600.00;
      double price = 0;
      double BMI = getBMI();
      if(age > 50){
         price = basePrice + 75.00;
         }
      else{
         price = basePrice;
         }
      if(smokingStatus.equalsIgnoreCase("smoker")){
            price = price + 100.00;
         }
      else{
         price = price;
         }
      if( BMI > 35){
         price = price + ((BMI-35) * 20);
         }
      else{
         price = price;
         }
         return price;
      }
   }//end Policy class