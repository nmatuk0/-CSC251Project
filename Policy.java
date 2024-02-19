//Programmed by Nina Mastukura Bernardino
//Program purpose: models an insurance policy for one person
public class Policy{
   //Attributes specific to policy info only (no more holder info)
   private int policyNumber;
   private String providerName;
   //Step 3 of Project 3: Add static field to keep track of # of Policy objects created
   private static int numOfPolicies = 0; 
   //Step 4 of Project 3: add policyHolder
   private PolicyHolder policyHolder;
      
   //Sets default values for attributes (no-arg constructor)
   public Policy(){
      policyNumber = 0;
      providerName = "";
      numOfPolicies ++;
      policyHolder = null;
   }
   
   //Contructor to initialize all fields with defaults
   public Policy(int policyNum, String provName, PolicyHolder holder){
      policyNumber = policyNum;
      providerName = provName;   
      numOfPolicies++;  
      policyHolder = holder;
   }
   
   //Setters and Getters
   //Policy name 
   public void setPolicyNumber(int policyNum){
      policyNumber = policyNum;
   }   
   public int getPolicyNumber(){
      return policyNumber;
   }
   //Provider name 
   public void setProviderName(String provName){
      providerName = provName;
   }
   public String getProviderName(){
      return providerName;
   }
   
   //Step 2 of Project 3: Add a toString method
   public String toString(){
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      return ""; //required return statement
   }
   
   //Method to get number of policies created
   public static int getNumOfPolicies(){
      return numOfPolicies;
   }
   
}   
