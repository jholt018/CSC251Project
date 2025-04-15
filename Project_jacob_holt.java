import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
//demo class
public class Project_jacob_holt{
   //main method
   public static void main(String[] args) throws IOException{
   //declare local variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      //Create arraylist
      ArrayList<Policy> policies = new ArrayList<>();

      //create file object
      File file = new File("PolicyInformation.txt");
      //check if file exists
      if(file.exists()){
         Scanner inputFile = new Scanner(file);
         //read from file
         while(inputFile.hasNext()){
            //handle blank lines
            String line = inputFile.nextLine().trim();
            if (line.isEmpty()) {
               continue;
               }
            //parse file
            policyNumber = Integer.parseInt(line);
            providerName = inputFile.nextLine().trim();
            firstName = inputFile.nextLine().trim();
            lastName = inputFile.nextLine().trim();
            age = Integer.parseInt(inputFile.nextLine().trim());
            smokingStatus = inputFile.nextLine().trim();
            height = Double.parseDouble(inputFile.nextLine().trim());
            weight = Double.parseDouble(inputFile.nextLine().trim());
            
            
            //create Policy object
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
               
         }
         //close file
         inputFile.close();
      }
      else
      {
         System.out.println("The file PolicyInformation.txt is not found.");
         return;//exit if file not found
      }
      
      
      
      //display information
      //iterate through policies
      for(Policy policy : policies)
      {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.printf("Policyholder's Height: %.1f" , policy.getHeight());
         System.out.printf("\nPolicyholder's Weight: %.1f" , policy.getWeight());
         System.out.printf("\nPolicyholder's BMI: %.2f" , policy.getBMI());
         System.out.printf("\nPolicy Price: $%,.2f" , policy.getPrice());
         System.out.println("\n\n");
         
      }
      //count how many smokers and non-smokers
      int smokers = 0;
      int nonSmokers = 0;
      
      for(Policy policy : policies) {
         if(policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smokers++;
         } else {
            nonSmokers++;
         }
      }

System.out.println("\nThe number of policies with a smoker is: " + smokers);
System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
      
   }//end main method
   
}//end of class