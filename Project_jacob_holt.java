import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
//demo class
public class Project_jacob_holt{
   //main method
   public static void main(String[] args) throws IOExeption{
   //declare local variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      //create file object
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      while(inputFile.hasNext()){
      
      policyNumber = inputFile.nextLine();
           
      providerName = keyboard.nextLine();
      
      firstName = keyboard.nextLine();
      
      lastName = keyboard.nextLine();
      
      age = keyboard.nextLine();
      smokingStatus = keyboard.nextLine();
      
      height = keyboard.nextLine();
      
      weight = keyboard.nextLine();
      
      //create Policy object
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      //Create arraylist
      ArrayList<Policy> array = new ArrayList<>();
      
      array.add(policy);      
      
      }
      
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