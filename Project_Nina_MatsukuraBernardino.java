//Demo for policy program
import java.util.Scanner;
public class Project_Nina_MatsukuraBernardino{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        
      //Get user info
      System.out.println("Please enter the Policy Number: ");
      int policyNumber = input.nextInt();
      
      System.out.println("Please enter the Provider Name: ");
      String providerName = input.nextLine();
      
      System.out.println("Please enter the Policyholder’s First Name: ");
      String holderFirstName = input.nextLine();
      
      System.out.println("Please enter the Policyholder’s Last Name: ");
      String holderLastName = input.nextLine();
      
      System.out.println("Please enter the Policyholder’s Age: ");
      int holderAge = input.nextInt();
      
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smokerStatus = input.nextLine();
      
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      double holderHeight = input.nextDouble();
      
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      double holderWeight = input.nextDouble();
      
      //Creates a single instance of the Policy class
      Policy policy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokerStatus, holderHeight, holderWeight);
      
      //Output
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder’s First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder’s Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder’s Age: " + policy.getHolderAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getSmokerStatus());
      System.out.println("Policyholder’s Height: " + policy.getHolderHeight() + "inches");
      System.out.println("Policyholder’s Weight: " + policy.getHolderWeight() + "pounds");
      System.out.println("Policyholder’s BMI: " + policy.calculateBMI());
      System.out.println("Policy Price: $" + policy.insuranceCost());
      
      input.close();
   }
}   
