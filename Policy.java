//Program purpose: models an insurance policy for one person
public class Policy{
   //Attributes
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokerStatus;
   private double holderHeight; //inches
   private double holderWeight; //pounds
   
   //Sets default values for attributes (no-arg constructor)
   public Policy(){
      policyNumber = 0;
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0; 
      smokerStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   //Contructor to initialize all fields with defaults
   public Policy(int policyNum, String provName, String firstName, String lastName, int age, String smoker, double height, double weight){
      policyNumber = policyNum;
      providerName = provName;
      holderFirstName = firstName;
      holderLastName = lastName;
      holderAge = age;
      smokerStatus = smoker;
      holderHeight = height;
      holderWeight = weight;     
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
   //Holder first name 
   public void setHolderFirstName(String firstName){
      holderFirstName = firstName;
   }
   public String getHolderFirstName(){
      return holderFirstName;
   }
   //Holder last name 
   public void setHolderLastName(String lastName){
      holderLastName = lastName;
   }
   public String getHolderLastName(){
      return holderLastName;
   }
   //Holder age
   public void setHolderAge(int age){
      holderAge = age;
   }
   public int getHolderAge(){
      return holderAge;
   }
   //Smoker status
   public void setSmokerStatus(String smoker){
      smokerStatus = smoker;
   }
   public String getSmokerStatus(){
      return smokerStatus;
   }
   //Holder height
   public void setHolderHeight(double height){
      holderHeight = height;
   }
   public double getHolderHeight(){
      return holderHeight;
   }
   //Holder weight
   public void setHolderWeight(double weight){
      holderWeight = weight;
   }
   public double getHolderWeight(){
      return holderWeight;
   }

   //Method calculates and returns the BMI of the policyholder
   public double calculateBMI(){
      return (holderWeight * 703)/(holderHeight*holderHeight);
   }
   
   //Method calculates and returns the price of the insurance policy
   public double insuranceCost(){
      double cost = 600;
      if (holderAge > 50){
         cost += 75;
      }
      if (smokerStatus.equals("Smoker")){
         cost += 100;
      }      
      double BMI = calculateBMI();
      if (BMI > 35){
         cost += (BMI-35) * 20;
      }
      return cost;
   }
}   
