public class Policy{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder = new PolicyHolder();
      //no arg constructor
   /** 
      no argument constructor class
   */
   public Policy(){
      policyNumber = 0;
      providerName = (" ");
      policyHolder = null;
         }//end no arg constructor
   
   //constructor that accepts arguments
   /** 
      with argument constructor class
      @param policy policy number
      @param provider providers name
      @param policyHolder policy holder info
      
   */

   public Policy(int policy, String provider, PolicyHolder holder){
      policyNumber = policy;
      providerName = provider;
      policyHolder = holder;
      

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
   
   
   
   /**
      method that gets BMI
      @return BMI of policyholder
   */
   
   public double getBMI(){
   double height = policyHolder.getHeight();
   double weight = policyHolder.getWeight();
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
      if(policyHolder.getAge() > 50){
         price = basePrice + 75.00;
         }
      else{
         price = basePrice;
         }
      if(policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")){
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
      public String toString(){
         return "\nPolicy Number: " + getPolicyNumber() +
         "\nProvider Name: " + getProviderName() + policyHolder +
         "\nPolicyholder's BMI: " + getBMI() +
         "\nPolicy Price: $" + getPrice() + "\n\n";
      }
   }//end Policy class