public class PolicyHolder{
   //declare fields
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   /**
      no arg constructor
   */
   public PolicyHolder(){
      firstName = (" ");
      lastName = (" ");
      age = 0;
      smokingStatus = (" ");
      height = 0.00;
      weight = 0.00;     
   }//end no arg constructor
   /**
      constructor that accepts arguments
      @param first policyholder first name
      @param last policyholder last name
      @param a policyholder age
      @param smoking policyholder smoking status
      @param  h policyholder height
      @param w policyholder weight
   */
   public PolicyHolder(String first, String last, int a, String smoking, double h, double w){
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = smoking;
      height = h;
      weight = w;
   }
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
   public String toString(){
      return "\nPolicyholder's First Name: " + getFirstName() + 
      "\nPolicyholder's Last Name: " + getLastName() +
      "\nPolicyholder's Age: " + getAge() +
      "\nPolicyholder's Smoking Status: " + getSmokingStatus() +
      "\nPolicyholder's Height: " + getHeight() +
      "\nPolicyholder's Weight: " + getWeight();
         
   }
}