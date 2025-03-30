import java.util.Scanner;
//demo class
public class Project_jacob_holt{
   //main method
   public static void main(String[] args){
   //declare local variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      //create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      keyboard.nextLine();//skip to next line
      
      System.out.print("\nPlease enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();//skip to next line
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      //create Policy object
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      //display information
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f" , policy.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f" , policy.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f" , policy.getBMI());
      System.out.printf("\nPolicy Price: $%,.2f" , policy.getPrice());
      
   }//end main method
   
}//end of class