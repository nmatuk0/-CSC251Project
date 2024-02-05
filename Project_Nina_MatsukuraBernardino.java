//Demo for policy program
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Project_Nina_MatsukuraBernardino{
   public static void main(String[] args) throws FileNotFoundException{
      //Read info about a set of Insurance Policies from a text file (PolicyInformation.txt) 
      ArrayList<Policy> policies = new ArrayList<>(); //array holds policy info
      
      try (Scanner scnr = new Scanner (new File("PolicyInformation.txt"))){
         while (scnr.hasNextLine()){
            int policyNumber = scnr.nextInt();
            scnr.nextLine();
            String providerName = scnr.nextLine();
            String holderFirstName = scnr.nextLine();
            String holderLastName = scnr.nextLine();
            int holderAge = scnr.nextInt();
            scnr.nextLine();
            String smokerStatus = scnr.nextLine();
            double holderHeight = scnr.nextDouble();
            double holderWeight = scnr.nextDouble();
            scnr.nextLine();
            
            //Creates a new policy object using info gathered above
            Policy policy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokerStatus, holderHeight, holderWeight);
            policies.add(policy);

         }         
      }
 
      //Output
      for (int i = 0; i < policies.size();++i){  
         Policy policy = policies.get(i);
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
         }
         
   }
}   
