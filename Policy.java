//Program purpose: models an insurance policy for one person
public class Policy{
   //Attributes specific to policy info only (no more holder info)
   private int policyNumber;
   private String providerName;
      
   //Sets default values for attributes (no-arg constructor)
   public Policy(){
      policyNumber = 0;
      providerName = "";
   }
   
   //Contructor to initialize all fields with defaults
   public Policy(int policyNum, String provName){
      policyNumber = policyNum;
      providerName = provName;     
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
   
}   
